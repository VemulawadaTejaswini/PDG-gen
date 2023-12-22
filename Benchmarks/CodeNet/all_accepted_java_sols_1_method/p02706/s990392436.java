import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[]a = new int[m];
		long cnt = 0;
		for(int i = 0; i < m; i++) {
			a[i] = stdIn.nextInt();
			cnt += a[i];
		}
		
		if(n>=cnt) {
			System.out.println(n-cnt);
		}else {
			System.out.println(-1);
		}
		
	}

}
