import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		int  A = scn.nextInt();
		int  B = scn.nextInt();
		int ans=0;
		if(((A>=1) && (A<=100)) && ((B>=1) && (B<=100))) {
			ans = A*B;
			System.out.println(ans);
		}
}
}