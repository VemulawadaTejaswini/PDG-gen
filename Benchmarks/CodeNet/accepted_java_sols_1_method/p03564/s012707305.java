import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int r = 1;
		for(int i=0;i<n;i++){
			// 操作A
			int a = r * 2;
			// 操作B
			int b = r + k;
			// 小さい方をセット
			if(a<b) r = a;
			else r = b;
		}
		System.out.println(r);
	}
}
