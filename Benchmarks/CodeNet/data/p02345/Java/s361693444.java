import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		SegmentTree st = new SegmentTree(n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int type = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if (type == 0) {
		        st.update(x, y);
		    } else {
		        sb.append(st.query(x, y)).append("\n");
		    }
		}
		System.out.print(sb);
	}
}

class SegmentTree {
    static final int INF = Integer.MAX_VALUE;
    int size;
    int base;
    int[] tree;
    
    public SegmentTree(int size) {
        this.size = size;
        base = 1;
        while (base < size) {
            base <<= 1;
        }
        tree = new int[base * 2 - 1];
        Arrays.fill(tree, Integer.MAX_VALUE);
    }
    
    public void update(int idx, int value) {
        updateTree(idx + base - 1, value);
    }
    
    private void updateTree(int idx, int value) {
        tree[idx] = value;
        if (idx == 0) {
            return;
        }
        
        if (idx % 2 == 1) {
            updateTree((idx - 1) / 2, Math.min(value, tree[idx + 1]));
        } else {
            updateTree((idx - 1) / 2, Math.min(value, tree[idx - 1]));
        }
    }
    
    public int query(int min, int max) {
        return query(min, max, 0, 0, base);
    }
    
    public int query(int min, int max, int idx, int left, int right) {
        if (min >= right || max < left) {
            return INF;
        }
        if (min <= left && right - 1 <= max) {
            return tree[idx];
        }
        int x1 = query(min, max, 2 * idx + 1, left, (left + right) / 2);
        int x2 = query(min, max, 2 * idx + 2, (left + right) / 2, right);
        return Math.min(x1, x2);
    }
 }
