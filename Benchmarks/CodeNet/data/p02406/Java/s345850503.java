import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) System.out.print(" " + i);
			else {
				String s = String.valueOf(i);
				for(int j = 0; j < s.length(); j++) {
					char three = s.charAt(j);
					if(three == '3') {
						System.out.print(" " + i);
						break;
					}
				}
			}
		}
		System.out.println("");
	}

}

