import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		long[] c = new long[n];
		long total = 1;

		for(int i=0;i<c.length;i++) {
			c[i]=scan.nextLong();
			if(c[i]==0) {
				total = 0;
			}else {
				total = total*c[i];
			}
		}

		long t = 1;

		for(int i=0;i<18;i++) {
			t = t*10;
		}

		if(total>t) {
			System.out.println("-1");
		}else {
			System.out.println(total);
		}

	}

}
