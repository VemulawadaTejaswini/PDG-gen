import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W  =sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		int num = Math.max(H, W);
		int cnt = 0;
		int mul = 0;
		while(mul < N){
			mul = num * cnt;
			cnt++;
		}
		System.out.println(cnt-1);

	}

}