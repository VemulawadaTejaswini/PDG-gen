import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 ArrayDeque<Integer> list  = new ArrayDeque<>();
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt(); 
		 for(int i = 0; i < n; i++) {
			 int command = sc.nextInt();
			 switch(command) {
			 	case 0:
			 		if(sc.nextInt() == 0){
			 			list.addFirst(sc.nextInt());
			 		}else {
			 			list.addLast(sc.nextInt());
			 		}
			 		break;
			 		
			 	case 1:
					Iterator<Integer> ite = list.iterator();
					int p = sc.nextInt();
					for(int j = 0; j < p; j++) {
						ite.next();
					}
					System.out.println(ite.next());
					break;
					
			 	case 2:
			 		if(sc.nextInt() == 0){
			 			list.removeFirst();
			 		}else  
			 			list.removeLast();
			 		break;	
			 
			 }
		 }
	 }
}

