import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		double r = scan.nextInt();
		double men = (double)r * (double)r *  (double)3.14159265358979323846264338327950288;
		double ensyu = (double)r * 2 * (double)3.14159265358979323846264338327950288;

	    BigDecimal bi_men = new BigDecimal(String.valueOf(men));
	    BigDecimal bi_en = new BigDecimal(String.valueOf(ensyu));
	    
	    men = bi_men.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
	    ensyu = bi_en.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
		
		System.out.println(men + " " + ensyu);
        scan.close();
    }

}