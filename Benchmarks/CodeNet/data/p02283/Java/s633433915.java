// implement a bst with insert and print

import java.util.Scanner;

public class Main {
	public static class node<T>{
		public T data;
		public node<T> p;
		public node<T> l_c;
		public node<T> r_c;
		
		public node(T _data) {
			data = _data;
			l_c = null;
			r_c = null;
			p = null;
		}
		
	}
	
	public static class bst<T extends Comparable<T>>{
		public node<T> root;
		
		public bst() {
			root = null;
		}
		//try to not use recursion in java if you want to modify some pointer data, since the pointer itself cannot be passed by reference
		
		public void insert(T key) {
			if(root == null) {
				root = new node<T>(key);
				return;
			}
			
			//otherwise we can make sure that current is not null
			node<T> p = null;
			node<T> current = root;
			while(current != null) {
				p = current;
				if(key.compareTo(current.data) <= 0) {
					current = current.l_c;
				}else {
					current = current.r_c;
				}
			}
			
			//which means the root itself is null
			if(key.compareTo(p.data) <= 0) {
				p.l_c = new node<T>(key);
				p.l_c.p = p;
			}else {
				p.r_c = new node<T>(key);
				p.r_c.p = p;
			}
			
			return;
		}
		
		
		//some helper function for display
		private void _inorder_print(node<T> current) {
			if(current == null) {
				return ;
			}
			
			_inorder_print(current.l_c);
			System.out.print(" "+current.data);
			_inorder_print(current.r_c);
			return;
			
		}
				
		public void inorder_print() {
			_inorder_print(root);
			System.out.println();
			return;
		}
		
		
		private void _preorder_print(node<T> current) {
			if(current == null) {
				return ;
			}
			
			System.out.print(" "+current.data);
			_preorder_print(current.l_c);
			_preorder_print(current.r_c);
			return;
		}
		
		
		public void preorder_print() {
			_preorder_print(root);
			System.out.println();
		}
	}
	
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int q_len = cin.nextInt();
		String cmd;
		int val;
		bst<Integer> bst = new bst<Integer>();
		while(q_len > 0) {
			cmd = cin.next();
			if(cmd.equals("insert")) {
				val = cin.nextInt();
				bst.insert(val);
			}else if(cmd.equals("print")) {
				bst.inorder_print();
				bst.preorder_print();
			}
			
			q_len--;
		}
		cin.close();
		
	}
}