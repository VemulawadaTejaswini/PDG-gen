import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Tree t = new Tree(n);
        
        for(int i = 0; i < n; i++) {
        	int id = sc.nextInt();
            int k = sc.nextInt();
            int pc = -1;
            for(int j = 0; j < k; j++) {
            	int c = sc.nextInt();
            	if (j == 0)
                    t.setChild(id, c);
                else
                    t.setRightSib(pc, c);
                t.setPar(c, id);
                pc = c;
            }
        }
        
        for(int i = 0; i < n; i++)
        	t.printR(i);
	}
}

class Tree {
	private class Node {
		int parent = -1;
		int leftChild = -1;
		int rightSib = -1;
		
		public int getDepth() {
			if(parent == -1)
				return 0;
			else
				return getDepth() + 1;
		}
		
		public String getType() {
			if(parent == -1)
				return "root";
			else if(leftChild == -1)
				return "leaf";
			else
                return "internal node";
		}
	}
	
	private Node[] node;
	
	public Tree(int n) {
		node = new Node[n];
		for(int i = 0; i < n; i++) {
			node[i] = new Node();
		}
	}
	
    public void setChild(int id, int c) {
        node[id].leftChild = c;
    }
 
    public void setRightSib(int id, int sib) {
        node[id].rightSib = sib;
    }
 
    public void setPar(int id, int par) {
        node[id].parent = par;
    }
    
    public void printR(int id) {
    	System.out.print("node " + id + ": parent = " + node[id].parent + ", depth = " + node[id].getDepth() + ", "
                + node[id].getType() + ", [");
        if (node[id].leftChild != -1) {
            System.out.print(node[id].leftChild);
            for (int c = node[node[id].leftChild].rightSib; c != -1; c = node[c].rightSib)
                System.out.print(", " + c);
        }
        System.out.println("]");
    }
	
}

