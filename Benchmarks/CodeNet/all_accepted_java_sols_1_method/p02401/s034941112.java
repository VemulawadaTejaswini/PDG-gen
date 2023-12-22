import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		while (true) {
        // 入力されるa,b,opを定義

        String stra = scanner.next();
        String op = scanner.next();
        String strb = scanner.next();

        int a = Integer.parseInt(stra);
        int b = Integer.parseInt(strb);

        // ?の時終了
        if ("?".equals(op)) {
        	break;
        }

        // opを判定してそれぞれ計算
        if ("+".equals(op)) {
        	System.out.println(a + b);
        } else if ("-".equals(op)){
        	System.out.println(a - b);
        } else if ("*".equals(op)) {
        	System.out.println(a * b);
        } else if ("/".equals(op)) {
        	System.out.println(a / b);
        }
		}

	}

}

