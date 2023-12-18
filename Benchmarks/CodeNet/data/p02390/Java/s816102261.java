import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int in_s = scan.nextInt();
		
		int h,m,s;
		
		h = in_s / 3600;
		in_s = in_s % 3600;
		
		m = in_s / 60;
		s = in_s % 60;
		
		System.out.println(h + ":" + m + ":" + s);
	}

}

