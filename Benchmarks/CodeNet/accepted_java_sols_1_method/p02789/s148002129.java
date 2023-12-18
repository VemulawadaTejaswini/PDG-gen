import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//合計テストケース数
		int ｍ = sc.nextInt();//正解テストケース数
		
		if(n == ｍ) System.out.println("Yes");
		else System.out.println("No");
		
		
		sc.close();
	}

}
