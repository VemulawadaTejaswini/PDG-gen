import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

    	Scanner sc = new Scanner(System.in);

    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int T = sc.nextInt();

    	double val = (T + 0.5) / A;
    	BigDecimal val2 = new BigDecimal(val);
    	BigDecimal seijo = val2.setScale(0, BigDecimal.ROUND_DOWN);

    	int val3 = seijo.intValue();

    	System.out.println( B * val3);

    	sc.close();
    }


}