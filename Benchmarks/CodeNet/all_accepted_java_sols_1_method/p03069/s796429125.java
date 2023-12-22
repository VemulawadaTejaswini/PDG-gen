import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		String S = keyboard.next();
		
		String[] ishi1 = S.split("");
		int count = 0;
		
		int[] Lkuro = new int[N];
		int[] Rshiro = new int[N];
		
		for (int i = 1; i < S.length(); i++) {
			if(ishi1[i-1].equals("#")) {
				Lkuro[i] = Lkuro[i-1] + 1;	
			}else {
				Lkuro[i] = Lkuro[i-1];
			}
		}
		
		for (int j = S.length() - 2; j >= 0; j--) {
			if(ishi1[j+1].equals(".")) {
				Rshiro[j] = Rshiro[j+1] + 1;	
			}else {
				Rshiro[j] = Rshiro[j+1];
			}
		}
		
		int kotae = 1000000;
		
		for(int k = 0; k < S.length(); k++) {
			kotae = Math.min(kotae, Lkuro[k]+ Rshiro[k]);
		}
		
		System.out.println(kotae);
		keyboard.close();
	}
}
