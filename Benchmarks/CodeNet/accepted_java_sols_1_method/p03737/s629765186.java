import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		sc.close();
		String str1 = s1.substring(0,1).toUpperCase();
		String str2 = s2.substring(0,1).toUpperCase();
		String str3 = s3.substring(0,1).toUpperCase();
		System.out.println(str1 + str2 + str3);
	}
}
