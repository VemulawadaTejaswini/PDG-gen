
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Node[] node = new Node[num];
		for(int i=0;i<num;i++) {//创建结点个数
			node[i] = new Node();
		}
		for(int i=0;i<num;i++) {
			int id = sc.nextInt();
			int count = sc.nextInt();
			int[] c = new int[count];
			for(int j=0;j<count;j++) {
				c[j]=sc.nextInt();
				node[c[j]].parent=id;
			}
			node[id].child = c;
		}
		for(int i=0;i<num;i++) {
			node[i].depth(node, 0,i);
		}
		for(int i=0;i<num;i++) {
			System.out.println("node "+ i+": "+"parent = "+node[i].parent+", depth = "+node[i].depth+", "+node[i].type+", "+Arrays.toString(node[i].child));
		}
		
	}
}

class Node {
	
	int parent = -1;
	int[] child;
	int depth;
	String type;
	
	public  void depth(Node[] node,int depth,int i) {
			int p = node[i].parent;	
			if(p==-1) {
			this.depth=depth;
			if(parent==-1) {
				type = "root";
			}else if(child.length==0) {
				type="leaf";
			}else {
				type="internal node";
			}
			return;
		}
		depth(node,depth+1,p);	
	}

	
	

}

