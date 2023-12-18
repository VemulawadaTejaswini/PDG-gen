import java.util.Arrays;
import java.util.Scanner;


public class Main {
	static String[] a = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	static String[] b = new String[] {"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] w = new int[10];
		int[] k = new int[10];
		for(int i = 0; i < 10; i++) {
			w[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			k[i] = stdIn.nextInt();
		}
		
		Arrays.sort(w);
		Arrays.sort(k);
		
		System.out.println((w[9] + w[8] + w[7]) + " " + (k[9] + k[8] + k[7]));
	}
	
}