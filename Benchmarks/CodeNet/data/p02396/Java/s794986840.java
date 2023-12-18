import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Scanner scanner = new Scanner(System.in);
	
	int num = 1;
	
	while(true) {
		int a = scanner.nextInt();
	
		
		if( a == 0) {
			
			break;
		
		}else {
			
			System.out.println("Case " + num++ +  ": " + a);
		}
		}
	
	}

}
