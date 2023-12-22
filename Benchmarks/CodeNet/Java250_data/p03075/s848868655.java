import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int[] num = new int[5];
		
		for(int i = 0; i<5; i++){
			num[i] = keyboard.nextInt();
		}
		
		int K = keyboard.nextInt();
		
		String ans = "Yay!";
		for(int j = 0; j<4; j++){
			for(int k = 1; k<5; k++){
				if(num[k] - num[j] > K){
					ans = ":(" ;
				}
			}
		}

		System.out.println(ans);
		keyboard.close();	
	}
}
