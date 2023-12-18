
import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for(int i=1;x!=0;i++){
			System.out.println("Case "+i+": "+x);
			x = scan.nextInt();
		}
		
	}

}