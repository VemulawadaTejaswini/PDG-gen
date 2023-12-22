import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//IDカード
		int m=sc.nextInt();		//ゲート
		
		int l=0;
		int r=n;
		
		for(int i=0;i<m;i++) {
			int l2=sc.nextInt();
			int r2=sc.nextInt();
			
			l=Math.max(l,l2);
			r=Math.min(r,r2);
		}
		int ans=r-l+1;
		if(ans>0) System.out.println(ans);
		else System.out.println(0);
	}
}