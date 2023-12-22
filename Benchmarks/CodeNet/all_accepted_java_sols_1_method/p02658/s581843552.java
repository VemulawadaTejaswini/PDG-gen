import java.math.BigDecimal;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
       	BigDecimal b = new BigDecimal("0");
        BigDecimal c = new BigDecimal("0");

    	for (int i = 0; i < a; i++) {
          	if (i == 0) {
                b = sc.nextBigDecimal();
            } else {
                c = sc.nextBigDecimal();
              	if (b.compareTo(new BigDecimal("1000000000000000000")) <= 0) {
                  b = b.multiply(c);
                }
              	if (b.compareTo(new BigDecimal("0")) == 0
                   || c.compareTo(new BigDecimal("0")) == 0) {
                  System.out.println(0);
                  return;
                }
            }
        }

      	if (b.compareTo(new BigDecimal("1000000000000000000")) > 0) {
          System.out.println(-1);
        } else {
          System.out.println(b);
        }
	}
}