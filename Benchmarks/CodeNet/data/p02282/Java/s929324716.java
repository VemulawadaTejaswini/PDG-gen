import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


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
		
		String[] tmpArray = br.readLine().split(" ");
		Node[] nodes = new Node[n];
		int[] pre = new int[n];
		for(int i = 0; i < n ; i++){
			pre[i] = Integer.parseInt(tmpArray[i]) - 1;
			nodes[i] = new Node(i, -1, -1);
			nodes[i].nodes = nodes;
		}
		tmpArray = br.readLine().split(" ");
		int[] in = new int[n];
		for(int i = 0; i < n ; i++){
			in[i] = Integer.parseInt(tmpArray[i]) - 1;
		}
		
		reconstruct(nodes, pre, in);
		
		//root??¢???
		int rootIdx = -1;
		for(int i = 0; i < nodes.length ;i++){
			if(nodes[i].parent == -1){
				rootIdx = i;
				break;
			}
		}
		rootIndex = rootIdx;
		
		postorder(nodes, rootIdx, 1);
		System.out.println();

	}
	
	static int reconstruct(Node[] nodes, int[] pre, int[] in){
		if(pre.length ==1 || in.length == 1){
			return pre[0];
		}
		//???????????????pre[0]???????????????
		int rootIndex = pre[0];
		int subLen = 0;
		for(int i = 0; i < in.length ; i++){
			if(in[i] == pre[0]){
				subLen = i;
				break;
			}
		}
		int leftIndex = -1;
		int rightIndex = -1;
		//?????´?????¨?????¨
		if(subLen >= 1){
			leftIndex = reconstruct(nodes, Arrays.copyOfRange(pre, 1, 1 + subLen), Arrays.copyOfRange(in, 0, subLen));
		}
		//?????´?????¨?????¨
		if(in.length - subLen - 1 >= 1){
			rightIndex = reconstruct(nodes, Arrays.copyOfRange(pre, subLen + 1, pre.length), Arrays.copyOfRange(in, subLen + 1, pre.length));
		}
		
		nodes[rootIndex].left = leftIndex;
		nodes[rootIndex].right = rightIndex;
		return rootIndex;
	}
	
	static int rootIndex = -1;
	static void postorder(Node[] nodes, int index){
		if(nodes[index].left != -1){
			postorder(nodes, nodes[index].left);
		}
		if(nodes[index].right != -1){
			postorder(nodes, nodes[index].right);
		}		
	}
	static void postorder(Node[] nodes, int index, int fix){
		if(nodes[index].left != -1){
			postorder(nodes, nodes[index].left, fix);
		}
		if(nodes[index].right != -1){
			postorder(nodes, nodes[index].right, fix);
		}		
		System.out.print((nodes[index].id+fix));
		
		if(index != rootIndex){
			System.out.print(" ");
		}
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