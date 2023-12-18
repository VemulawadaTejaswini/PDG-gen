import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Integer cnt = Integer.parseInt(sn.next());
		BigDecimal sum = new BigDecimal(sn.next());
        for (int i=0; i < cnt -1; i++){
			sum = sum.multiply(new BigDecimal(sn.next()));
        }
   		if (sum.compareTo(new BigDecimal(Math.pow(10, 18))) > 0) {
			System.out.print(-1);
		}else {
			System.out.print(sum);
		}
	}
}
