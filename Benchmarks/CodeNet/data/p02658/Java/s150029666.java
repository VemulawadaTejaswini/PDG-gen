import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		long[] c = new long[n];
		long total = 1L;

		for(int i=0;i<c.length;i++) {
			c[i]=scan.nextLong();;
			if(c[i]==0) {
				total = 0;
			}else {
				total = total*c[i];
			}
		}

		if(total>1000000000000000000L) {
			System.out.println("-1");
		}else if(total<0){
			System.out.println(total*(-1));
		}else {
			System.out.println(total);
		}

	}

}
