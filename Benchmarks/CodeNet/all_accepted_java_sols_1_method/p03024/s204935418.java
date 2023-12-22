import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String S=sc.next();
		int n=0;
for(int i=0;i<S.length();i++) {
	if(S.charAt(i)=='o')n++;
}
String ans="NO";
if(n+15-S.length()>=8)ans="YES";
		System.out.println(ans);

	}

}
