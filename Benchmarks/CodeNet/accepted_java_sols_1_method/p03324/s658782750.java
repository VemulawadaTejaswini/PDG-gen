import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
		Scanner sc =new Scanner(System.in);
		int d=sc.nextInt();
		int n=sc.nextInt();
		if(n==100)n++;
		System.out.println((int)Math.pow(100, d)*n);
	
	}
	
}



