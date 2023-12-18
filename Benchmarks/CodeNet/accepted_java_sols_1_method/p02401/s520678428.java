import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		// 標準入力からデータを読み込む準備
		Scanner sc = new Scanner(System.in);
		// 2つの文字の固まりをそれぞれ整数値と想定して読み込む 
		int area = 0;/* ここを変えて面積を求めよう */
		for(;;){
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		if(b.equals("?")){
			break;
		}
		if(b.equals("+")){
			area = a+c;
		}
		if(b.equals("-")){
			area = a-c;
		}
		if(b.equals("*")){
			area = a*c;
		}
		if(b.equals("/")){
			area = a/c;
		}
		System.out.println(area);
		}
		sc.close();
		}
}
