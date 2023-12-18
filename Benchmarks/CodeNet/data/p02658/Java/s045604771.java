import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		long[] c = new long[n];
		long total = 1L;

		c[0] = scan.nextLong();

		for(int i=1;i<c.length;i++) {
			c[i]=scan.nextLong();
			if(c[i]==0) {
				total = 0;
			}else {
				total = total*c[i];
			}
		}

		if(total<=1000000000000000000L/c[0]) {
			System.out.println(total*c[0]);
		}else {
			System.out.println("-1");
		}

	}

}
