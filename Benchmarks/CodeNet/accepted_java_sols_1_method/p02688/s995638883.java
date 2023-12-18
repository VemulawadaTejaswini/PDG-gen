import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		boolean[] res = new boolean[n];
		int result = 0;
		for(int i = 0; i < k; i++){
			int d = scan.nextInt();
			for(int j = 0; j < d; j++){
				int a = scan.nextInt();
				res[a-1] = true;
			}
		}
		for(int i = 0; i < n; i++){
			if(res[i] == false)result++;
		}
		System.out.println(result);
	}
}
