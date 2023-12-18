import java.util.Scanner;

public class Main {

	public static final int BIG_NUM = 2000000000;
	public static final int MOD = 1000000007;
	public static Node[] nodes;
	public static StringBuilder ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int V = sc.nextInt();
		nodes = new Node[V];
		int[] in_num = new int[V];

		for(int i = 0; i < V; i++){
			in_num[i] = 0;
		}

		int node_id,left_child,right_child;

		for(int loop = 0; loop < V; loop++){

			node_id = sc.nextInt();
			left_child = sc.nextInt();
			right_child = sc.nextInt();

			nodes[node_id] = new Node(left_child,right_child);

			if(left_child != -1){
				in_num[left_child]++;
			}
			if(right_child != -1){
				in_num[right_child]++;
			}
		}

		int root = -1;
		for(int i = 0; i < V; i++){
			if(in_num[i] == 0){
				root = i;
				break;
			}
		}

		ans = new StringBuilder();

		ans.append("Preorder\n");
		Preorder(root);
		ans.append("\nInorder\n");
		Inorder(root);
		ans.append("\nPostorder\n");
		Postorder(root);
		ans.append("\n");

		System.out.print(ans.toString());
	}

	public static void Preorder(int node_id){

		ans.append(" ").append(Integer.toString(node_id));

		if(nodes[node_id].left_child != -1){
			Preorder(nodes[node_id].left_child);
		}
		if(nodes[node_id].right_child != -1){
			Preorder(nodes[node_id].right_child);
		}
	}

	public static void Inorder(int node_id){

		if(nodes[node_id].left_child != -1){
			Inorder(nodes[node_id].left_child);
		}
		ans.append(" ").append(Integer.toString(node_id));

		if(nodes[node_id].right_child != -1){
			Inorder(nodes[node_id].right_child);
		}
	}

	public static void Postorder(int node_id){

		if(nodes[node_id].left_child != -1){
			Postorder(nodes[node_id].left_child);
		}
		if(nodes[node_id].right_child != -1){
			Postorder(nodes[node_id].right_child);
		}
		ans.append(" ").append(Integer.toString(node_id));
	}

}


class Node{

	public int left_child;
	public int right_child;

	Node(int arg_left_child,int arg_right_child){
		left_child = arg_left_child;
		right_child = arg_right_child;
	}
}
