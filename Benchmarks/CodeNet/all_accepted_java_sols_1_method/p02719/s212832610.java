import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long N=sc.nextLong(),K = sc.nextLong();
		long amari = N%K;
		if(amari!=0) {
			long ans = Long.min(amari, K-amari);
			System.out.println(ans);
		}else {
			System.out.println(0);
		}
	}

}