import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		for(int tt = 1; ; tt++){
			final long input = sc.nextLong();
			
			if(input == 0){
				break;
			}
			
			System.out.println("Case " + tt + ": " + input);
		}
		
		
	}
	
}