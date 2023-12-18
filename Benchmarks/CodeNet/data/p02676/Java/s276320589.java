import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int K =scan.nextInt();
		String S =scan.next();
		
		if(K>=S.length()) {
			System.out.println(S);
		}
		else {
			for(int i=0;i<K;i++) {
				System.out.print(S.charAt(i));
			}
			System.out.print("...");
		}
		
	}
}
