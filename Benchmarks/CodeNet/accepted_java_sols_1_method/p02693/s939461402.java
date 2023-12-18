import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int kyori=(b/k)*k;
		
		if(a<=kyori) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		sc.close();
	}

}
