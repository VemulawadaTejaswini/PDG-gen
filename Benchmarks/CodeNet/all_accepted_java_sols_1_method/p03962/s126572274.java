import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		
		int count = 0;
		if(a == b && b == c) {
			count = 1;
		}else if(a != b && b != c &&  c != a){
			count = 3;
		}else {
			count = 2;
		}

			System.out.println(count);
			
		keyboard.close();	
	}
}
