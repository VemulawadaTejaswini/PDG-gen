import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		String S =scan.next();
		String T =scan.next();
		int result =T.indexOf(S);
		if(result==0&&S.length()+1==T.length()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
