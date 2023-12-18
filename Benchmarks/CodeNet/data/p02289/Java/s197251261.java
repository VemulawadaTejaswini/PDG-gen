import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		BST bst = new BST();
		boolean nsair = true;
		while(nsair) {
			String op = in.next();
			if(op.equals("insert")) {
				int num = in.nextInt();
				bst.insert(bst, num);
			} else if (op.equals("extract")) {
				System.out.println(bst.remove(bst));
			} else if(op.equals("end")) {
				nsair = false;
			}
		}
	}
	public static class BSTNode {
		int key;
		BSTNode left;
		BSTNode right;
		BSTNode() {
			key = 0;
			left = null;
			right = null;
		}
	}
	/*public static class Key {
		int chave;
		Key() {
			chave = 0;
		}		
	}*/
	public static class BST {
		BSTNode root;
		int nodecount;
		public BSTNode mod(int k) {
			BSTNode rt = new BSTNode();
			rt.key = k;
			rt.left = null;
			rt.right = null;
			return rt;
		}
		public BST createBST(BST bst) {
			bst.root = null;
			bst.nodecount = 0;
			return bst;
		}
		public void clear(BST bst) {
			bst.root =null;
			bst.nodecount = 0;
		}
		public int size(BST bst) {
			return bst.nodecount;
		}
		public int find(BST bst, int k) {
			return findhelp(bst.root, k);
		}
		public int findhelp(BSTNode rt, int k) {
			if(rt == null) {
				return -1;
			}
			if(rt.key > k) {
				return findhelp(rt.left, k);
			} else if (rt.key < k) {
				return findhelp(rt.right, k);
			} else if (rt.key == k){	
				return rt.key;
			} else {
				return findhelp(rt.right, k);
			}
		}
		public void insert(BST bst, int k) {
			bst.root = inserthelp(bst.root, k);
			bst.nodecount++;
		}
		public BSTNode inserthelp(BSTNode rt, int k) {
			if(rt == null) {
				//System.out.println("concretizou " + k);
				return mod(k);
			} else if(rt.key == -1) {
				//System.out.println("concretizou " + k);
				if((rt.left == null && rt.right == null)) {
					//System.out.println("concretizou " + k);
					rt.key = k;
					rt.left = null;
					rt.right = null;
					return rt;
				} else if (rt.right != null) {

					System.out.println(1);
					rt.key = rt.right.key;
					if(rt.right.right != null) {
						rt.right = rt.right.right;
					}
					if(rt.right.left != null) {
						rt.left = rt.right.left;
					}
					rt.right.key = -1;
					rt.right.right = null;
					rt.right.left = null;
					inserthelp(rt.right, k);
				} else {
					System.out.println(2);
					//System.out.println(rt.left);
					rt.key = rt.left.key;
					if(rt.left.right != null) {
						rt.right = rt.left.right;
					}
					if(rt.left.left != null) {
						rt.left = rt.left.left;
					}
					rt.left.key = -1;
					rt.left.left = null;
					rt.left.right = null;
					inserthelp(rt.left, k);
				}
			} else if(rt.key > k) {
				//System.out.println("inserindo a equerda " + k);
				rt.left = inserthelp(rt.left, k);
			} else {
				//System.out.println(rt.left.key);
				//System.out.println("inserindo a direita " + k);
				rt.right = inserthelp(rt.right, k);

			}
			return rt;
		}
		public static int remove(BST r) {
			//System.out.println(r.root.key);
			if(r.root.right != null && r.root.right.key != -1) {

				r.nodecount--;
				//System.out.println("passou");
				return removehelp(r.root.right);
			} else {
				r.nodecount--;
				if(r.root.left == null || r.root.left.key == -1) {
					//System.out.println("passou");
					//System.out.println(r.root.left.key);
					int retorno = r.root.key;
					r.root.key = -1;
					r.root.left = null;
					r.root.right = null;
					return retorno;
				} else {
					//System.out.println("passou");
					int retorno = r.root.key;
					//System.out.println(r.root.left.key);
					r.root = r.root.left;
					//if(r.root.left.left != null && r.root.left.left.key != -1) {
					//r.root.left = r.root.left.left;
					//r.root.left.key = r.root.left.left.key;
					//}
					//if(r.root.left.right != null && r.root.left.right.key != -1) {
					//r.root.left = r.root.left.right;
					//r.root.left.key = r.root.left.right.key;
					//}
					//r.root.left.key = -1;
					//r.root.left.left = null;
					//r.root.left.right = null;
					return retorno;
				}
			} 
		}
		public static int removehelp(BSTNode b) {
			if( b.right != null && b.right.key != -1) {
				return removehelp(b.right);
			} else {
				if(b.left == null || b.left.key == -1) {
					int retorno = b.key;
					//System.out.println("Passouaqui");
					b.key = -1;
					b.left = null;
					b.right = null;
					return retorno;
				} else {
					//System.out.println("Passouaqui2");
					int retorno = b.key;
					b.key = b.left.key;
					if(b.left.left != null && b.left.left.key != -1) {
						b.left = b.left.left;
					}
					if(b.left.right != null && b.left.right.key != -1) {
						b.right =b.left.right;
					}
					b.left.key = -1;
					b.left.left = null;
					b.left.right = null;
					return retorno;
				}
			}
		}
	}
}



