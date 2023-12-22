import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		for (int i = 0; i < n; i++) {
			if(sc.nextInt()%2==1)ans++;
		}
		if(ans%2==0)System.out.println("YES");
		else System.out.println("NO");
		
		}
		
	}