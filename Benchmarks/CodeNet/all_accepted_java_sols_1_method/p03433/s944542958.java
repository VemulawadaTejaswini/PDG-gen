import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int a=sc.nextInt();
		
		int kouka=n%500;
		
		if(kouka-a<=0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}