import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		Scanner scan = new Scanner(System.in);

		
		int X = scan.nextInt();
		int t = scan.nextInt();
		int ans = X - t;
		if(ans<=0) {
			System.out.println("0");
		}else {
			System.out.println(ans);
		}
		
		
		/*for(int i = 0; i <= A; i++) {
			for(int j = 0; j < A; j++) {
				System.out.print("☆");
				
			}
			System.out.println("");
		}*/
		
	}

}
