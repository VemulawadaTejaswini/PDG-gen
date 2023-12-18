import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt( br.readLine());
		Node[] tree = new Node[n];
		//??¨??????????????????????????????????????£?????????
		for(int i = 0; i < n; i++){
			tree[i] = new Node(i);
		}
		
		for(int i = 0; i < n; i++){
			
			String[] tmpArray = br.readLine().split(" ");
			
			int inputID = Integer.parseInt(tmpArray[0]);
			int childNum = Integer.parseInt(tmpArray[1]);
			for(int j = 0; j < childNum ; j++){
				int tmpIndex = Integer.parseInt(tmpArray[j + 2]);
				tree[inputID].addChild(tree[tmpIndex]);
				tree[tmpIndex].parent = inputID;
				tree[tmpIndex].depth = tree[inputID].depth + 1;
				//System.out.println("test");
			}
			
		}
		
		for(int i = 0; i < n; i++){
			System.out.print("node " + tree[i].id + ": parent = " + tree[i].parent + ", depth = "
					+ tree[i].depth + ", " + tree[i].type() + ", ");
			tree[i].printChildren();
			System.out.println();
		}
	}

}

class Node {
	int parent = -1;
	int id = -1;
	ArrayList<Node> children = new ArrayList<Node>();
	int depth = 0;
	
	public Node (int id){
		this.id = id;
	}
	
	public void addChild(Node n){
		children.add(n);
	}
	
	public void printChildren(){
		System.out.print("[");
		for(int i = 0; i < children.size(); i++){
			System.out.print(children.get(i).id);
			if(i != children.size() - 1){
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	
	public String type(){
		if(parent == -1){
			return "root";
		}
		else if(children.size() == 0){
			return "leaf";
		}
		else{
			return "internal node";
		}
	}
}