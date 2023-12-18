import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan =new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();


if(b.contains(a)) {
	System.out.println("YES");
}else {
	System.out.println("NO");
}
		scan.close();
	}

}
