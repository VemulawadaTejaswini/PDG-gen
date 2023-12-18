import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int inNum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);	
		do {
			inNum = sc.nextInt();
			if (inNum < 0 || inNum > 10000) {
				System.err.println("Err!");
				return;
			}
			list.add(new Integer(inNum));
			count++;
			// 0が入力されたかデータセットが１万件に達したら入力終了
		 } while (inNum != 0 || count == 10000);
		 
		 for (int i = 1; i < list.size(); i++) {
		 	System.out.printf("Case " + i + ": " + list.get(i-1) + "%n");
		 }
		
	}
}
