import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String N = scan.next();

		for (int i = 0; i <= 2; i++){
			char K = N.charAt(i);
			if(K=='7'){
				System.out.println("Yes");
				System.exit(0);
			}
		}
		
		System.out.println("No");
	}
}