import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String com;
			String com_data[];
			Node workNode;
			int i;

			Node headNode = new Node();
			Node tailNode = new Node();
			headNode.setData(-1);
			headNode.setNext(tailNode);
			tailNode.setData(-1);
			tailNode.setPrev(headNode);

			for(i=0; i<n; i++){
				com = br.readLine();
				if(com.equals("deleteFirst")){
					workNode=headNode.getNext();
					if(workNode!=tailNode){
						headNode.setNext(workNode.getNext());
						workNode.getNext().setPrev(headNode);
					}
				} else if(com.equals("deleteLast")){
					workNode=tailNode.getPrev();
					if(workNode!=headNode){
						tailNode.setPrev(workNode.getPrev());
						workNode.getPrev().setNext(tailNode);
					}
				} else{
					com_data = com.split(" ", 0);
					if(com_data[0].equals("insert")){
						Node insertNode = new Node();
						insertNode.setData(Integer.parseInt(""+com_data[1]));
						insertNode.setNext(headNode.getNext());
						insertNode.setPrev(headNode);
						headNode.getNext().setPrev(insertNode);
						headNode.setNext(insertNode);
					} else if(com_data[0].equals("delete")){
						for(workNode=headNode.getNext();
							workNode.getData()!=-1;
							workNode=workNode.getNext()){
							if(workNode.getData()==Integer.parseInt(""+com_data[1])){
								workNode.getPrev().setNext(workNode.getNext());
								workNode.getNext().setPrev(workNode.getPrev());
								break;
							}
						}
					}
				}
			}

			for(workNode=headNode.getNext(),i=0;
				workNode.getData()!=-1;
				workNode=workNode.getNext(),i++){
				if(i!=0) System.out.print(" ");
				System.out.print(workNode.getData());
			}
			System.out.println();
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}
class Node{
	private int data;
	private Node prev;
	private Node next;
	public int getData(){
		return data;
	}
	public Node getPrev(){
		return prev;
	}
	public Node getNext(){
		return next;
	}
	public void setData(int data){
		this.data = data;
	}
	public void setPrev(Node prev){
		this.prev = prev;
	}
	public void setNext(Node next){
		this.next = next;
	}
}