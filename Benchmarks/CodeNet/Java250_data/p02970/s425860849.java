import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int d=sc.nextInt();
		int ans=(n+d*2)/(d*2+1); //最小値出す
		
		System.out.println(ans);
	}

}
