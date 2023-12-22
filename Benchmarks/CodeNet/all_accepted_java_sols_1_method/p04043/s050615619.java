import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
		if(a+b+c==17) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
