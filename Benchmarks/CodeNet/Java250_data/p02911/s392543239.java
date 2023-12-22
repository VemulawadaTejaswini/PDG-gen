import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		Arrays.fill(arr, k);
		if(k>q) {
			
			for(int i = 0;i<n;i++)System.out.println("Yes");
			return;
		}else {
			for(int i = 0;i<q;i++) {
				int temp = sc.nextInt();
				arr[temp-1]++;
			}
		}
		for(int i = 0;i<n;i++) {
			if(arr[i]>q)System.out.println("Yes");
			else System.out.println("No");
		}

	}

}
