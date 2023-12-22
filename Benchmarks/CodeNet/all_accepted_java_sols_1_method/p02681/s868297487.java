import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String D = sc.nextLine();
        int n = S.length();
        D = D.substring(0, n);
        if (S.equals(D)) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");

        }

	}
}
