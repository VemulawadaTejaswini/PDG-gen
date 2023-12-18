import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
      
		int X=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		int ans= (X-A)%B;
		
		System.out.println(ans);
	}
}