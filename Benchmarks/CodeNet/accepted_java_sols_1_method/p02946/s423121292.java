import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
        //Xを軸としてK-1を左右に表示させる
		int Zahyou = K-1;
		for(int i=X-Zahyou; i<=X+Zahyou; i++) {
			System.out.print(i+" ");
		}

	}
}