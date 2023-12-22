import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int A = keyboard.nextInt();
		int B = keyboard.nextInt();
		int C = keyboard.nextInt();
		
		String ans;
		
		if(A < C && C < B) {
			ans = "Yes";
		}else {
			if(B < C && C < A) {
				ans = "Yes";
			}else {
				ans = "No";
			}
		}
			System.out.println(ans);
			
		keyboard.close();	
	}
}