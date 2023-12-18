import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		long K=sc.nextLong();
		long A=sc.nextLong();
		long B=sc.nextLong();
		if(A>=B) {
			System.out.println(K+1);return;
		}
		//a回お金ふやしてb回ビスケットに変えてc回たたく
		//お金は使い切ったほうがいいのでa==bが理想
		long score=0;

		if(B<A+2)score=K+1;
		else {
			long change=(K+1-A)/2;
			System.err.println(change);
			score=change*(B-A)+K-change*2+1;
		}
		System.out.println(score);

	}

}
