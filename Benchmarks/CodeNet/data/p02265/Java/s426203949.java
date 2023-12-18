import java.util.LinkedList;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer>linkedList = new LinkedList<Integer>();
		int n =scanner.nextInt();
		String command;
		int number;
		
		for(int i=0;i<n;i++){
			command=scanner.next();
			number=scanner.nextInt();
			switch (command) {
			case "insert":
				linkedList.addFirst(number);
				break;
			case "delete":
				linkedList.remove(linkedList.indexOf(number));
				break;
			case "deleteFirst":
				linkedList.removeFirst();
				break;
			case "deleteLast":
				linkedList.removeLast();
			default:
				break;
			}
		}
		
		int isZero=0;
		while(linkedList.size()!=0){
			if(isZero>0){
				System.out.print(" ");
			}
			System.out.print(linkedList.poll());
			isZero++;
		}
		System.out.println("");
	}
}