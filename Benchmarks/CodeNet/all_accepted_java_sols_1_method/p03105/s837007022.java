import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = 0;

		if(a > b){
			System.out.println(res);
		}else{
			res = b /a ;
			if(res > c){
				res = c;
			}
          System.out.println(res);
		}

		sc.close();
	}
}
