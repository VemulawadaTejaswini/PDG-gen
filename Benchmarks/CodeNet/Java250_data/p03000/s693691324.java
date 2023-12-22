
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		//读取数据
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int [] L = new int[N];
		int ans = N + 1;
		int i = 0;
		do {
			L[i] = scanner.nextInt();
			i ++;
		}while(i < N);
		int [] arr = new int[N + 1];
		arr[0] = 0;
		for(int j = 1; j <= N; j++) {
			arr[j] = arr[j-1] + L[j-1];
			if(arr[j] > X) {
				ans = j;
				break;
			}
		}
		System.out.println(ans);
		
	}
}
