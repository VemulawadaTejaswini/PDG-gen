import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String S = sc.next();

		if(S.equals("Sunny")){
			System.out.println("Cloudy");
		}else if(S.equals("Cloudy")){
			System.out.println("Rainy");
		}else{
			System.out.println("Sunny");
		}

		sc.close();
	}
}
