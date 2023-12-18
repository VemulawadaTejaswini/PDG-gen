import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());

		String[] tmp;

		Node firstNode = new Node(-1);
		firstNode.next = firstNode;
		firstNode.pre = firstNode;

		for(int i = 0 ; i < n ; i++ ){
			tmp =  br.readLine().split(" ");
			if(tmp[0].equals("insert")){
				Node newNode;
				Node tmpNode;

				newNode = new Node(Integer.parseInt(tmp[1]));
				tmpNode = firstNode.next;

				firstNode.next = newNode;
				newNode.pre = firstNode;
				newNode.next = tmpNode;
				tmpNode.pre = newNode;
			}else if(tmp[0].equals("delete")){
				Node currentNode = firstNode.next;
				int key = Integer.parseInt(tmp[1]);

				while(currentNode.key != key && currentNode.key != -1){
					currentNode = currentNode.next;
				}

				if(currentNode.key != -1){
					Node nextNode = currentNode.next;
					Node preNode = currentNode.pre;

					preNode.next = nextNode;
					nextNode.pre = preNode;
				}

			}else if(tmp[0].equals("deleteFirst")){

				Node deletedNode = firstNode.next;
				Node nextNode = deletedNode.next;

				firstNode.next = nextNode;
				nextNode.pre = firstNode;


			}else if(tmp[0].equals("deleteLast")){
				Node deletedNode = firstNode.next;
				Node preNode = deletedNode.pre;

				preNode.next = firstNode;
				firstNode.pre = preNode;
			}
		}

		Node currentNode = firstNode.next;
		StringBuilder sb = new StringBuilder();
		while(currentNode.key != -1){
			sb.append(currentNode.key);
			sb.append(" ");
			currentNode = currentNode.next;
		}

		System.out.println(sb.toString().trim());

	}
}

class Node{

	public Node(int key){
		this.key = key;
	}

	int key;
	Node pre;
	Node next;
}