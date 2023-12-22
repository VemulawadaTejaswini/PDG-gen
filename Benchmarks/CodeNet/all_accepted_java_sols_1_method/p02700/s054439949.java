import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

do {

	c -= b;
	if(c <= 0)break;
	a -= d;
}while(a >0);

System.out.println(a>0? "Yes" : "No");
		scan.close();

	}

}
