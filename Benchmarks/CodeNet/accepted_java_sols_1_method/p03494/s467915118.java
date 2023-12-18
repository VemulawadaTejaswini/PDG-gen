import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 != 0) {
				flag = false;
				break;
			}
		}
		int count = 0;
		while (flag) {
			count++;
			for (int i = 0; i < n; i++) {
				arr[i] /= 2;
				if (arr[i] % 2 != 0) {
					flag = false;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
