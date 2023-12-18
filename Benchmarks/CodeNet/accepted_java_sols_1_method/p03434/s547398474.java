import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		
		int alice = 0;
		int bob = 0;
		
		for(int i = 0; i < n; i++) {
			int now = arr[arr.length - 1 - i];
			if(i % 2 == 0) {
				alice += now;
			}else {
				bob += now;
			}
		}
		
		System.out.println(alice-bob);
	}
}
