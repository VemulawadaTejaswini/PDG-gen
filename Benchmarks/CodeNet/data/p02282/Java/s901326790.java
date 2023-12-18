import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	int n, pos;
	ArrayList<Integer> Pre = new ArrayList<>();
	ArrayList<Integer> In = new ArrayList<>();
	ArrayList<Integer> Post = new ArrayList<>();
	
	//入力
	public void input() {
		int k;
		n = sc.nextInt();
		//先行順巡回
		for(int i=0; i<n; i++) { k = sc.nextInt(); Pre.add(k); }
		//中間順巡回
		for(int i=0; i<n; i++) { k = sc.nextInt(); In.add(k); }
	}
	
	//後行順に出力
	public void solve() {
		pos = 0;
		rec( 0, Pre.size() );
		for(int i=0; i<n; i++) {
			if(i==0) System.out.print( Post.get(i) );
			else System.out.print(" "+Post.get(i));
		}
		System.out.println();
	}
	
	//木の修復
	public void rec(int l, int r) {
		if(l >= r) return;
		int root = Pre.get(pos++);
		int m = In.indexOf(root);
		rec(l, m);
		rec(m+1, r);
		Post.add(root);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.solve();
	}
}

