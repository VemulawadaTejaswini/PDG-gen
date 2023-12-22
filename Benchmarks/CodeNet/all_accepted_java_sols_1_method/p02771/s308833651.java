import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt(),B=sc.nextInt(),C=sc.nextInt();
		if((A==B && B!=C)||(B==C && C!=A)||(C==A && A!=B)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
