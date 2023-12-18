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
		
		Node[] heap = new Node[n+1];
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 1; i <= n ;i++){
			heap[i] = new Node(Integer.parseInt(tmpArray[i - 1]));
		}
		
		for(int i = 1; i <= n ;i++){
			if(2*i < heap.length) heap[i].left = heap[2*i];
			if(2*i + 1 < heap.length) heap[i].right = heap[2*i + 1];
			heap[i].parent = heap[i/2];
		}
		
		for(int i = 1; i <= heap.length - 1 ; i++){
			System.out.print("node " + i + ": key = " + heap[i].key + ", ");
			if(heap[i].parent != null){
				System.out.print("parent key = " + heap[i].parent.key + ", ");
			}
			if(heap[i].left != null){
				System.out.print("left key = " + heap[i].left.key + ", ");
			}
			if(heap[i].right != null){
				System.out.print("right key = " + heap[i].right.key + ", ");
			}
			System.out.println();
		}
		
	}

}

class Node {
	int key;
	Node left;
	Node right;
	Node parent;
	
	public Node(int key){
		this.key = key;
		left = null;
		right = null;
		parent = null;
	}
}