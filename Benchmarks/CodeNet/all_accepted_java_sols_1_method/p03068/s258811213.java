import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		String SS = keyboard.next();	
		int K = keyboard.nextInt();
		
		String[] moji = SS.split("");
			
		int nokosu = K - 1;
		String hana = moji[nokosu];
		
		for(int j=0; j < SS.length() ; j++) {
			if (moji[j].equals(hana)) {	
			}else {
				moji[j] = "*";
			}
		}
		for(int k=0; k < N; k++) {
			System.out.print(moji[k]);
		}
		keyboard.close();	

	}
}