import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long N=scan.nextInt();
		long A=scan.nextInt();
		long B=scan.nextInt();

		long ans =B*(N-1)+A - (A*(N-1)+B) +1;
		ans = Math.max(ans, 0);
		if(N==1&&A!=B){
			ans=0;
		}
		System.out.println(ans);

	}

}
