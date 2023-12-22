import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int count=0;
		if(s.charAt(0)=='1') {
			count++;
		}
		if(s.charAt(1)=='1') {
			count++;
		}
		if(s.charAt(2)=='1') {
			count++;
		}
		System.out.println(count);
	}

}
