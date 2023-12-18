import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt();
		if(a-b>0) {
			System.out.println(a-b);
		}else {
			System.out.println(0);
		}
	}

}
