import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int kame=b/2-a;
		int turu=-b/2+2*a;

		if(!(b%2==0)) {
			System.out.println("No");
		}
		else if(turu<0||kame<0) {
			System.out.println("No");
		}
		else if((kame+turu)==a) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}

}
