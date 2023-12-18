import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		sb2.append(s1);
		sb2.reverse();
		sb1.append(s2);
		sb1.reverse();


		if(s1.equals(sb1.toString()) && s2.equals(sb2.toString())) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
