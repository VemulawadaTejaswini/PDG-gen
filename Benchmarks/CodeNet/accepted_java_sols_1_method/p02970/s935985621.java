import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N= sc.nextInt();
		int D = sc.nextInt();
		
			System.out.println((N + D * 2) / (D * 2 + 1));
		}

	}