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
		
		
		//find whether a given key exists within the tree rooted by current
		private node<T> _find(node<T> current, T key) {
			if(current == null) {
				return null;
			}
			
			if(current.data.equals(key)) {
				return current;
			}
			
			//otherwise, try to recursively search the key
			if(key.compareTo(current.data) < 0) {
				return _find(current.l_c, key);
			}
			return _find(current.r_c, key);
		}
		
		
		//find the minimum element within the tree rooted by current, current 
		private node<T> minimum_elem(node<T> current){
			if(current == null) return null;
			node<T> p = null;
			while(current != null) {
				p = current;
				current = current.l_c;
			}
			return p;
			
		}
		
		private node<T> successor(node<T> n){
			if(n.r_c != null) {
				return minimum_elem(n.r_c);
			}
			//otherwise find the ancestors
			node<T> p = n.p;
			while(p != null && n == p.r_c) {
				n = p;
				p = p.p;
			}
			
			// here n == (p.l_c).r_c ... r_c or p == null; 
			return p;
		}
		
		
		public boolean find(T key) {
			return (_find(root, key) != null);
		}
		
		
		//here we implement the deletion operation
		public void delete(T key) {
			//first find the node
			node<T> z = _find(root, key);
			if(z == null) return; // which means nothing to be deleted
			
			//first check the type of the key
			node<T> victim = z;
			if(victim.l_c != null && victim.r_c != null) {
				//now the victim should be the successor of z
				victim = successor(z);
				// the victim as a successor should have only a right child, and it won't be null
			}
			
			node<T> abdicator = null;
			if(victim.l_c != null) abdicator = victim.l_c;
			if(victim.r_c != null) abdicator = victim.r_c;
			
			if(abdicator != null)
				abdicator.p = victim.p; // take over parent
			
			//which means victim is root
			if(victim.p == null) {
				root = abdicator;
			}else {
				if(victim.p.r_c == victim) {
					victim.p.r_c = abdicator;
				}else {
					victim.p.l_c = abdicator;
				}
			}
			//finally
			if(z != victim) {
				z.data = victim.data;
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
			}else if(cmd.equals("find")) {
				if(bst.find(cin.nextInt())) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}else if(cmd.equals("delete")) {
				val = cin.nextInt();
				bst.delete(val);
			}
			
			q_len--;
		}
		cin.close();
		
	}
}