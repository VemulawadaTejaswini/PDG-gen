import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int k = sc.nextInt();
		String s = sc.next();
		if(k >= s.length()) {
			System.out.println(s);
		}else{
			 String s1 = new String(s);
			String s2  = s1.substring(0,k);
			System.out.println(s2 + "...");
		}
		sc.close();
	}
}
