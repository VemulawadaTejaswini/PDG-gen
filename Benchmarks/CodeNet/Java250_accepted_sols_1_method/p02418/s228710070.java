import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//文字列を入力
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();

		//文字列をカウント
		int n=s.length();
		String x;
		String y;
		//文字列を加工
		for(int i=0;i<=n-1;i++) {
			if(s.indexOf(p)!=-1) {
				System.out.println("Yes");
				break;
			}
			if(i==n-1) {
				System.out.println("No");
			}
			x=s.substring(0,n-1);
			y=s.substring(n-1,n);
			s=y+x;
		}
	}

}

