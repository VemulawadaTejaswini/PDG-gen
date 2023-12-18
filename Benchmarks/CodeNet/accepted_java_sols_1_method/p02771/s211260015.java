import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if(a == b){
			if(b == c){
				System.out.println("No");
			}else{
				System.out.println("Yes");
			}
		}else{
			if(b == c){
				System.out.println("Yes");
			}else{
				if(c == a){
					System.out.println("Yes");
				}else{
					System.out.println("No");
				}
			}
		}
	}

}
