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
			headNode.data = -1;
			headNode.next = tailNode;
			tailNode.data = -1;
			tailNode.prev = headNode;

			for(i=0; i<n; i++){
				com = br.readLine();
				if(com.equals("deleteFirst")){
					workNode = headNode.next;
					if(workNode != tailNode){
						headNode.next = workNode.next;
						workNode.next.prev = headNode;
					}
				} else if(com.equals("deleteLast")){
					workNode = tailNode.prev;
					if(workNode != headNode){
						tailNode.prev = workNode.prev;
						workNode.prev.next = tailNode;
					}
				} else{
					com_data = com.split(" ", 0);
					if(com_data[0].equals("insert")){
						Node insertNode = new Node();
						insertNode.data = Integer.parseInt(""+com_data[1]);
						insertNode.next = headNode.next;
						insertNode.prev = headNode;
						headNode.next.prev = insertNode;
						headNode.next = insertNode;
					} else if(com_data[0].equals("delete")){
						for(workNode = headNode.next;
							workNode.data != -1;
							workNode = workNode.next){
							if(workNode.data == Integer.parseInt(""+com_data[1])){
								workNode.prev.next = workNode.next;
								workNode.next.prev = workNode.prev;
								break;
							}
						}
					}
				}
			}

			for(workNode = headNode.next,i=0;
				workNode.data != -1;
				workNode = workNode.next,i++){
				if(i!=0) System.out.print(" ");
				System.out.print(workNode.data);
			}
			System.out.println();
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}
class Node{
	int data;
	Node prev;
	Node next;
}