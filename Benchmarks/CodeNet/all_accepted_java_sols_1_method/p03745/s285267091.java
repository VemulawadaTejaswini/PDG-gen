import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		long count = 1;
		boolean flg = true;//前で切られたか(単調増加/減少かわからないとき
		boolean isTanchoUP = true;
		for(int i = 1; i < n; i++) {
			if(flg) {
				flg = false;
				if(arr[i] > arr[i-1]) {
					isTanchoUP = true;
				} else if(arr[i]==arr[i-1]) {
					flg = true;
				} else {
					isTanchoUP = false;
				}
				continue;
			}
			if(isTanchoUP) {
				if(arr[i] < arr[i-1]) {
					flg = true;
					count++;
				}
			} else {
				if(arr[i] > arr[i-1]) {
					flg = true;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
