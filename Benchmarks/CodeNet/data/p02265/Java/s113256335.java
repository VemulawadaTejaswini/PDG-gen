import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = readInt(r);

		String commnd;
		int key;
		LinkedList linkedList = new LinkedList();
		Node firstNode = new Node();
		firstNode.setNext(firstNode);
		firstNode.setPrev(firstNode);
		linkedList.setFirstNode(firstNode);

		while(n > 0){
			String[] str = r.readLine().split(" ");
			commnd = str[0];

			if(commnd.equals("insert")){
				key = Integer.parseInt(str[1]);
				linkedList.insert(key);
			}else if(commnd.equals("delete")){
				key = Integer.parseInt(str[1]);
				linkedList.delete(key);
			}else if(commnd.equals("deleteFirst")){
				linkedList.deleteFirst();
			}else if(commnd.equals("deleteLast")){
				linkedList.deleteLast();
			}else{
				throw new Exception("?????£?????????????????§???");
			}
			n--;
		}

		Node node = firstNode.getNext();
		StringBuffer sb = new StringBuffer();
		while(node.getKey() != -1){
			sb.append(node.getKey());
			sb.append(" ");
			node = node.getNext();
		}

		System.out.println(sb.toString().trim());
	}

	public static int readInt(BufferedReader r) throws Exception{
        return Integer.parseInt(r.readLine());
    }


}

class LinkedList{


	Node firstNode;

	public void insert(int key){
		if(firstNode.getNext().getKey() == -1){
			Node newNode = new Node();
			newNode.setKey(key);

			newNode.setPrev(firstNode);
			newNode.setNext(firstNode);

			firstNode.setNext(newNode);
			firstNode.setPrev(newNode);
		}else{
			Node newNode = new Node();
			newNode.setKey(key);
			Node oldNode = firstNode.getNext();

			firstNode.setNext(newNode);

			newNode.setPrev(firstNode);
			newNode.setNext(oldNode);

			oldNode.setPrev(newNode);
		}
	}

	public void delete(int key) throws Exception{
		Node tempNode = null;
		Node prevNode = null;
		Node nextNode = null;

		tempNode = firstNode.getNext();

		while(true){
			if(tempNode.getKey() == key){
				prevNode = tempNode.getPrev();
				nextNode = tempNode.getNext();
				prevNode.setNext(nextNode);
				nextNode.setPrev(prevNode);
				break;
			}else if(tempNode.getKey() == -1){
				throw new Exception("?????£?????????????????§???");
			}
			tempNode = tempNode.getNext();
		}
	}

	public void deleteFirst() throws Exception{
		if(firstNode.getNext().getKey() == -1){
			throw new Exception("?????£?????????????????§???");
		}else{
			Node nextNode = firstNode.getNext().getNext();
			firstNode.setNext(nextNode);
			nextNode.setPrev(firstNode);
		}
	}

	public void deleteLast() throws Exception{
		if(firstNode.getPrev().getKey() == -1){
			throw new Exception("?????£?????????????????§???");
		}else{
			Node preveNode = firstNode.getPrev().getPrev();
			firstNode.setPrev(preveNode);
			preveNode.setNext(firstNode);
		}
	}

	public Node getFirstNode() {
		return firstNode;
	}

	public void setFirstNode(Node firstNode) {
		this.firstNode = firstNode;
	}
}

class Node{

	private Node next;
	private Node prev;
	private int key;

	Node() {
		this.next = null;
		this.prev = null;
		this.key = -1;
	}

	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
}