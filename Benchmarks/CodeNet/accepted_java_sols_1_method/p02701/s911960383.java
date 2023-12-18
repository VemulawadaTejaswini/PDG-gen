import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			hs.add(scan.next());
		}
		
		System.out.println(hs.size());
		
	}
		

}
