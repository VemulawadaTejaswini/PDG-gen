import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static class Node{
		Node right, left;
		int number;
		int bit;
		
		public Node(Node right, Node left) {
			super();
			this.right = right;
			this.left = left;
		}
		
		public Node(int number) {
			super();
			this.number = number;
		}
		
		public String toString(){
			if(right == null && left == null){
				return number + "(" + bit + ")";
			}else{
				return "(" + right.toString() + " " + left.toString() + ") (" + bit + ")";
			}
		}
	}
	
	public static Node make_tree(char[] input, int start, int end, Node[] array, ArrayList<Node> nodes){		
		int c_start = start, c_end = end, c_level = 0;
		int sep = -1;
		
		for(int i = start; i <= end; i++){
			if(input[i] == '('){
				if(c_level == 0){
					c_start = i;
				}
				c_level++;
			}else if(input[i] == ')'){
				c_level--;
				
				if(c_level == 0){
					c_end = i;
				}
			}else if(c_level == 1 && input[i] == ' '){
				sep = i;
			}else if(c_level == 0 && input[i] >= '0' && input[i] <= '9'){
				Node node = new Node(input[i] - '0');
				array[input[i] - '0' - 1] = node;
				return node;
			}
		}
		
		Node node = new Node(make_tree(input, c_start + 1, sep - 1, array, nodes), make_tree(input, sep + 1, c_end - 1, array, nodes));
		nodes.add(node);
		return node;
	}
	
	public static int count(Node top, ArrayList<Node> nodes, int depth){
		int ret = 0;
		
		if(depth >= nodes.size()){
			if((ok(top) & 15) == 15){
				//System.out.println(nodes);
				
				return 1;
			}else{
				return 0;
			}
		}else{
			for(int i = 0; i < 3; i++){
				nodes.get(depth).bit = i;
				ret += count(top, nodes, depth + 1);
			}
		}
		
		return ret;
	}
	
	public static int ok(Node top){
		if(top.left == null && top.right == null){
			return top.bit;
		}
		
		int bit = ok(top.left);
		
		if(top.bit == 0){
			bit &= ok(top.right);
		}else if(top.bit == 1){
			bit |= ok(top.right);
		}else if(top.bit == 2){
			bit ^= ok(top.right);
			bit &= 15;
		}
		
		//System.out.println(bit);
		
		return bit;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String in = sc.nextLine();
			
			if("END".equals(in)){
				break;
			}
			
			final int n = Integer.parseInt(sc.nextLine());
			
			Node[] leafs = new Node[n];
			ArrayList<Node> nodes = new ArrayList<Node>();
			
			Node top = make_tree(in.toCharArray(), 0, in.length() - 1, leafs, nodes);
			//System.out.println(top);
			
			for(int i = 0; i < n; i++){
				String[] str = sc.nextLine().split(" ");
				int bit = (Integer.parseInt(str[0]) << 3) + (Integer.parseInt(str[1]) << 2) + (Integer.parseInt(str[2]) << 1) + Integer.parseInt(str[3]);
				leafs[i].bit = bit;
				//System.out.println(Arrays.toString(str));
				//System.out.println(bit);
			}
			
			System.out.println(count(top, nodes, 0));
		}
		
	}

}