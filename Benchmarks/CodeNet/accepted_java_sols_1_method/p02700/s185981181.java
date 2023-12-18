import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();		//たかはし体力
		int b=sc.nextInt();		//たかはし攻撃
		int c=sc.nextInt();		//あおき体力
		int d=sc.nextInt();		//あおき攻撃
		
		while(a>0&&c>0) {
			a=a-d;
			c=c-b;
		}
		if(c<=0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}