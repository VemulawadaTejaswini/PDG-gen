import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int t;
		if(k==1) {
			t=0;
		}else {
			t=n-k;
		}
		System.out.println(t);
	}

}