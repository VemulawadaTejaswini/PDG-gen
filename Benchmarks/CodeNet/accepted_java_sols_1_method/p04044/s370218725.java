import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		
		String[] input = new String[n];
		
		for (int i=0; i<n; i++) {
			input[i] = sc.next();
		}
		
		Arrays.sort(input);
		
		String result = "";
		for (int j=0; j<n; j++) {
			result += input[j];
		}
		
		System.out.println(result);
		sc.close();
	}

}