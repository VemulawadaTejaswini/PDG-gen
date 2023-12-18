import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray;
		Node[] nodes = new Node[n];
		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");
			
			int id = Integer.parseInt(tmpArray[0]);
			int left = Integer.parseInt(tmpArray[1]);
			int right = Integer.parseInt(tmpArray[2]);
			nodes[id] = new Node(id, left, right);
			nodes[id].nodes = nodes;
		}
		
		//?????¨???????????¨???????¨????
		for(int i = 0 ; i < nodes.length ; i++){
			if(nodes[i].left != -1){
				nodes[nodes[i].left].parent = i;
				nodes[i].degree++;
				if(nodes[i].right != -1){
					nodes[nodes[i].left].sibling = nodes[i].right; 
				}
			}
			if(nodes[i].right != -1){
				nodes[nodes[i].right].parent = i;
				nodes[i].degree++;
				if(nodes[i].left != -1){
					nodes[nodes[i].right].sibling = nodes[i].left;
				}
			}
		}
		
		//root??¢???
		int rootIdx = -1;
		for(int i = 0; i < nodes.length ;i++){
			if(nodes[i].parent == -1){
				rootIdx = i;
				break;
			}
		}
		//??????
		System.out.println("Preorder");
		preorder(nodes, rootIdx);
		System.out.println();
		System.out.println("Inorder");
		inorder(nodes, rootIdx);
		System.out.println();
		System.out.println("Postorder");
		postorder(nodes, rootIdx);
		System.out.println();
		
	}
	
	static void preorder(Node[] nodes, int index){
		System.out.print(" "+nodes[index].id);
		if(nodes[index].left != -1){
			preorder(nodes, nodes[index].left);
		}
		if(nodes[index].right != -1){
			preorder(nodes, nodes[index].right);
		}
	}
	
	static void inorder(Node[] nodes, int index){
		if(nodes[index].left != -1){
			inorder(nodes, nodes[index].left);
		}
		System.out.print(" "+nodes[index].id);
		if(nodes[index].right != -1){
			inorder(nodes, nodes[index].right);
		}
	}
	
	static void postorder(Node[] nodes, int index){
		if(nodes[index].left != -1){
			postorder(nodes, nodes[index].left);
		}
		if(nodes[index].right != -1){
			postorder(nodes, nodes[index].right);
		}		
		System.out.print(" "+nodes[index].id);
	}

}

class Node {
	int id;
	int left = -1;
	int right = -1;
	int parent = -1;
	int sibling = -1;
	int degree = 0;
	Node[] nodes;
	
	public Node (int id, int left, int right){
		this.id =id;
		this.left = left;
		this.right = right;
	}
	
	int getDepth (){
		if(parent == -1){
			return 0;
		}
		return 1 + nodes[parent].getDepth();
	}
	
	int getHeight (){
		if(left == -1 && right == -1){
			return 0;
		}
		
		int heightL = 0;
		if(left != -1){
			heightL = nodes[left].getHeight();
		}
		
		int heightR = 0;
		if(right != -1){
			heightR = nodes[right].getHeight();
		}
		
		return Math.max(heightL, heightR) + 1;
	}
	
	String getType (){
		if(parent == -1){
			return "root";
		}
		else if(left == -1 && right == -1){
			return "leaf";
		}
		else {
			return "internal node";
		}
	}
}