import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int n = 0;
		int m = 0;
		int s = 0;

		for(int i = 0;i<X+1;i++) {
			m=X-i;
			n=2*i+4*m;
			if(n==Y) {
				s=1;
			}
		}
		if(s==1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
