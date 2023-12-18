
import java.util.Scanner;

// use segment tree to calculate the inversion pair in a seq


public class Main {
	public static int N  = 1<<30;
	public static class node{
		public int count;
		public node l_child;
		public node r_child;
		
		public node() {
			count = 0;
			l_child = null;
			r_child = null;
		}
	}
	
	
	//use an implicit segment tree to do the count
	public static class seg_tree{
		public node root;
		
		public seg_tree() {
			root = null;
		}
		
		public node _insert(node current, int s, int e, int i) {
			if(current == null) {
				current = new node();
			}
			
			if(s==e) {
				current.count = 1;
				return current;
			}
			
			int mid = (s + e) >> 1;
			if(i <= mid) {
				current.l_child = _insert(current.l_child, s, mid, i);
			}else {
				current.r_child = _insert(current.r_child, mid+1, e, i);
			}
			
			if(current.l_child == null) current.l_child = new node();
			if(current.r_child == null) current.r_child = new node();
			
			current.count = current.l_child.count + current.r_child.count;
			return current;
		}
		
		
		public int _count(int q_s, int q_e, int s, int e, node current) {
			if(q_s > e || q_e < s) return 0;
			if(current == null) return 0;
			if(q_e >= e && s >= q_s)  return current.count;
			
			int mid = (s+e) >> 1;
			int res = 0;
			if(q_s <= mid) {
				res += _count(q_s, Math.min(q_e, mid), s, mid, current.l_child);
			}
			
			if(q_e >= mid+1) {
				res += _count(Math.max(q_s, mid+1), q_e, mid+1, e, current.r_child);
			}
			
			return res;
			
			
		}
		
		public void insert(int i) {
			root = this._insert(root, 0, N, i);
		}
		
		
		public int get_count(int q_s, int q_e) {
			return _count(q_s, q_e, 0, N, root);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		seg_tree t = new seg_tree();
		int q = 0;
		int pair_count = 0;
		for(int i = 0; i < n; i++) {
			q = cin.nextInt();
			pair_count += t.get_count(q, N);
			t.insert(q);
			
		}
		
		
		System.out.println(pair_count);
		cin.close();
	}
}