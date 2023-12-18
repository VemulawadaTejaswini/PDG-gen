import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[]input = new int[n];
		for(int i=0;i<n;i++) {
			input[i]= sc.nextInt();
		}
		Arrays.sort(input);
		String res = "YES";
		for(int i=0;i<n-1;i++) {
			if(input[i]==input[i+1]) {
				res ="NO";
				break;
			}
		}
		System.out.println(res);


	}

}
