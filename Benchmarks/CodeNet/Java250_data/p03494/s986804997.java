
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean bo = true;
		int cnt = 0;
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			arr[i] = tmp;
			if(tmp % 2 != 0) bo = false;
		}
		while(bo) {
			cnt++;
			for(int i = 0; i < n; i++) {
				arr[i] /= 2;
				if(arr[i] % 2 != 0) {
					bo = false;
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}
