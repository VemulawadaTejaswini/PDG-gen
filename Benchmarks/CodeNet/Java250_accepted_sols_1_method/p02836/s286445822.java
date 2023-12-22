import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		String S = scanner.next();
		int count =0;
		
		char a[]=S.toCharArray();
		
		for(int i = 0; i < S.length(); i++){
			if(a[i] != a[S.length() - 1 - i]) {
				count++;
			}
		}
		System.out.println(count/2);

		scanner.close();
	}
}
