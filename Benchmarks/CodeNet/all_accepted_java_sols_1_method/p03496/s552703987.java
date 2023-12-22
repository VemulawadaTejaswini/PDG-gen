import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int maxIdx = 0;
		boolean isPlus = false;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			int x = Math.abs(arr[i]);
			if (x > max) {
				max = x;
				maxIdx = i + 1;
				isPlus = (arr[i] >= 0);
			}
		}
		if (maxIdx == 0) {
			System.out.println(0);
			return;
		}
		int count = 0;
		StringBuilder sb = new StringBuilder(); 
		for (int i = 1; i <= n; i++) {
			if (maxIdx != i){
				sb.append(maxIdx).append(" ").append(i).append("\n");
				count++;
			}
		}
		if (isPlus) {
			for (int i = 1; i <= n - 1; i++) {
				sb.append(i).append(" ").append(i + 1).append("\n");
				count++;
			}
		} else {
			for (int i = n; i >= 2; i--) {
				sb.append(i).append(" ").append(i - 1).append("\n");
				count++;
			}
		}
		System.out.println(count);
		System.out.print(sb);
	}
}
