import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	 public static void main(String[] args) {
		 ArrayList<Integer> a  = new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt(); 
		 for(int i = 0; i < n; i++) {
			 int command = sc.nextInt();
			 switch(command) {
			 	case 0:
			 		a.add(sc.nextInt());			 		
			 		break;
			 		
			 	case 1:
			 		System.out.println(a.get(sc.nextInt()));
			 		break;
			 		
			 	case 2:
			 		a.remove(a.size() - 1);
			 		break;	
			 
			 }
		 }
	 }
}

