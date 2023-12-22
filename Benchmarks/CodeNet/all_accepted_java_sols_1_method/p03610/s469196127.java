import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		Scanner scan = new Scanner(System.in);

		
		String s = scan.nextLine();
		
		for(int i = 0; i < s.length(); i+=2) {
			System.out.print(s.charAt(i));
		}
		/*for(int i = 0; i <= A; i++) {
			for(int j = 0; j < A; j++) {
				System.out.print("☆");
				
			}
			System.out.println("");
		}*/
		
	}

}
