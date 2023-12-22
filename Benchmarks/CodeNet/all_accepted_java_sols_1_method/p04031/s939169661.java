import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N = keyboard.nextInt();
		int[] ebi = new int[N];
		for(int i=0; i<N; i++) {
			ebi[i] = keyboard.nextInt();
		}
		Arrays.sort(ebi);
		
		int min = ebi[0];
		int Max = ebi[N-1];
		
		int kotae = 100000000;
		
		for(int j = min; j < Max + 1; j++) {
			int sum = 0;
			for(int k = 0; k < N; k++) {
			sum += Math.pow(ebi[k] - j , 2);
			}
			kotae = sum < kotae ? sum : kotae;
		}
		
		System.out.println(kotae);
		keyboard.close();
	}
}