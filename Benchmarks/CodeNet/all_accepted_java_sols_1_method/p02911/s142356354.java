import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		Arrays.fill(arr, k-q);
		for(int i = 0; i < q; i++) {
			arr[sc.nextInt()-1]++;
		}
		for(int i = 0; i < n; i++) {
			if(arr[i] > 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}

}
