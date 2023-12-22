import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String[] arr = new String[N];
		int[] cnt = new int[N];
		cnt[0]=1;
		for (int i = 0; i < N; i++) {
			arr[i] = input.next();
		}
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			cnt[i] = cnt[i-1]+1;
			for (int j = i-1; j >= 0; j--) {
				if (arr[i].equals(arr[j])) {
					cnt[i]--;
					break;
				}else break;
			} 
		}
		System.out.println(cnt[N-1]);
	}
}