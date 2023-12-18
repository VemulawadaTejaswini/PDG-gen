import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal A =new BigDecimal(sc.nextLong());
		BigDecimal B =new BigDecimal(sc.nextLong());
		BigDecimal oldTax =new BigDecimal("0.08");
		BigDecimal newTax =new BigDecimal("0.10");
		BigDecimal A_ans = A.divide(oldTax,RoundingMode.HALF_UP);
		BigDecimal B_ans = B.divide(newTax,RoundingMode.HALF_UP);
		MathContext mc = new MathContext(0,RoundingMode.HALF_UP);
		if (A_ans.compareTo(B_ans) >= 0) {
			if (B_ans.multiply(oldTax,mc).setScale(0, RoundingMode.DOWN).compareTo(A) == 0 && B_ans.multiply(newTax,mc).setScale(0, RoundingMode.DOWN).compareTo(B) == 0) {
				System.out.println(B_ans);
			}else if(A_ans.multiply(oldTax,mc).setScale(0, RoundingMode.DOWN).compareTo(A) == 0 && A_ans.multiply(newTax,mc).setScale(0, RoundingMode.DOWN).compareTo(B) == 0) {
				System.out.println(A_ans);
			}else {
				System.out.println(-1);
			}
		}else {
			if (A_ans.multiply(oldTax,mc).setScale(0, RoundingMode.DOWN).compareTo(A) == 0 && A_ans.multiply(newTax,mc).setScale(0, RoundingMode.DOWN).compareTo(B) == 0) {
				System.out.println(A_ans);
			}else if(B_ans.multiply(oldTax,mc).setScale(0, RoundingMode.DOWN).compareTo(A) == 0 && B_ans.multiply(newTax,mc).setScale(0, RoundingMode.DOWN).compareTo(B) == 0) {
				System.out.println(B_ans);
			}else {
				System.out.println(-1);
			}
		}

	}
}