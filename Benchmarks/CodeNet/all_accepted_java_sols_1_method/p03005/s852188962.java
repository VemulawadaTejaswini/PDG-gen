import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
	
		int N = keyboard.nextInt();
		int K = keyboard.nextInt();
		
		if(K != 1) {
			System.out.println(N - K);
		}else {
			System.out.println(0);
		}
		keyboard.close();	
	}
}