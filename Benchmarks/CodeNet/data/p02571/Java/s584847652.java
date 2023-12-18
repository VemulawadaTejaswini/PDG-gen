import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();

		int x,y=0;

		int count =0;
		for(int i =0; i<T.length();i++) {
			int result1 =S.indexOf(T.substring(i, T.length()));
			int result2 =S.indexOf(T.substring(0, T.length()-i));

			if(result1!=-1 || result2!=-1) {
				count = i;
				break;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
