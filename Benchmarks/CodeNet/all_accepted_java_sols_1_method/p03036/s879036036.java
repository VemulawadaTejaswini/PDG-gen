import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
 
		int r = scanner.nextInt();
		int D = scanner.nextInt();
		int x = scanner.nextInt();
 
		for(int i = 1; i <= 10; i++){
			x = r*x -D;
			System.out.println(x);
		}
		scanner.close();
	}
 
}