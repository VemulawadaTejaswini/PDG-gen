import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = 0;
	
	while (scan.hasNext()) {
	    int n1 = scan.nextInt();
	    String op = scan.next();
	    int n2 = scan.nextInt();
	    
	    int answer = 0;	    
	    if ("+".equals(op)) {
		answer = n1 + n2;
	    } else if ("-".equals(op)) {
		answer = n1 - n2;
	    } else if ("*".equals(op)) {
		answer = n1 * n2;
	    } else if ("/".equals(op)) {
		answer = n1 / n2;
	    } else if ("?".equals(op)) {
		System.exit(0);
	    } else {
		// 本来ならエラー処理
		System.out.println("演算子が違います");
	    }
	    
	    System.out.println(answer);
	}
    }
}