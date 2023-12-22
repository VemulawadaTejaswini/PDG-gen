import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int t=sc.nextInt();
		int ans=0;
		ans=(int) ((t+0.5)/a);
		ans=ans*b;
		System.out.println(ans);
	}
}