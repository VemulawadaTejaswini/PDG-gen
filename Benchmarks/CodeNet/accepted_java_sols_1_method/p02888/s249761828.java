import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int res = 0;
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				int min = Integer.max(arr[i]-arr[j], arr[j]-arr[i]), max = arr[i]+arr[j];
				int st;
				if(arr[j+1] > min) {
					st = j+1;
				}
				else if(arr[n-1] <= min) {
					continue;
				}
				else {
					int a = j+1, b = n-1;
					while(b-a > 1) {
						int c = (a+b)/2;
						if(arr[c] > min) b = c;
						else a = c;
					}
					st = b;
				}
				int end;
				if(arr[n-1] < max) {
					end = n;
				}
				else if(arr[j+1] >= max) {
					continue;
				}
				else {
					int a = j+1, b = n-1;
					while(b-a > 1) {
						int c = (a+b)/2;
						if(arr[c] < max) a = c;
						else b = c; 
					}
					end = b;
				}
				res += end - st;
			}
		}
		System.out.println(res);
	}

}
