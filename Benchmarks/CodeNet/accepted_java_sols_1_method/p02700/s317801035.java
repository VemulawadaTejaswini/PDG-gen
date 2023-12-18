import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		while( true ) {
			c-=b;
			if(c<=0)break;
			a-=d;
			if(a<=0)break;

		}
		
		System.out.println(a>c ? "Yes" : "No");

	}

}

