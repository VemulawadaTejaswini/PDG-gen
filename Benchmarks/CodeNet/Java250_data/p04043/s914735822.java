import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int A= gi();
	    int B= gi();
	    int C= gi();

	    if ((A==5 && B== 5 && C==7)
	    || (A==5 && B== 7 && C==5)
	    || (A==7 && B== 5 && C==5)) {
            System.out.print("YES");
	    }else {
	    	System.out.print("NO");
	    }
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}
}