import java.util.LinkedList;
import java.util.Scanner;
class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			int n=Integer.parseInt(sc.next());
			LinkedList<Integer> dll=new LinkedList<>();
			for(int i=0;i<n;i++){
				String order = sc.next();
				if(order.equals("insert")){
					Integer key = Integer.parseInt(sc.next());
					dll.addFirst(key);
				}else if(order.equals("delete")){
					Integer key = Integer.parseInt(sc.next());
					dll.remove(key);
				}else if(order.equals("deleteFirst")){
					dll.removeFirst();
				}else if(order.equals("deleteLast")){
					dll.removeLast();
				}
			}
			System.out.print(dll.pollFirst());
			for(int i:dll)System.out.print(" "+i);
System.out.println();
		}
	}
}