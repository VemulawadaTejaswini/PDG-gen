
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc= new Scanner(System.in);
		long n=sc.nextInt();

		long sum=0;

		for(;n>0;n=n/10) {
			sum+=n%10;
		}
		if(sum%9==0) {
		System.out.println("Yes");
		}else {
		System.out.println("No");
		}
	}

}
