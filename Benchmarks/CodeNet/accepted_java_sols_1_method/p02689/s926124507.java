import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n + 1];
		boolean[] check = new boolean[n + 1];
		Arrays.fill(check, true);
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(arr[a] > arr[b])
				check[b] = false;
			else if(arr[a] < arr[b])
				check[a] = false;
			else {
				check[a] = check[b] = false;
			}
		}
		int res = 0;
		for(int i = 1; i <= n; i++) {
			if(check[i])
				res++;
		}
		System.out.println(res);
    }
}