import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();		//数字列の長さ
		
		double ans=0;
		for(int i=0;i<n;i++) {
			double a=sc.nextDouble();
			ans+=1.0/a;
		}
		ans=1.0/ans;
		System.out.println(ans);

	}

}
