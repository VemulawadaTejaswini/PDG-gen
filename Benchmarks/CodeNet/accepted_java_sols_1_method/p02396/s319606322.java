import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //1行目の入力
		for(int i = 1; x != 0; i++){
			System.out.println("Case "+i+": "+x);
			x = sc.nextInt();
		}
	}
}
