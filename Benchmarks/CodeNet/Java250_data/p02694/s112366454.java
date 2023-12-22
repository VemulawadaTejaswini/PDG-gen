import java.math.BigDecimal;
import java.sql.Array;
import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		
		BigDecimal bd1 = new BigDecimal(sc.next());
		BigDecimal bd  = new BigDecimal("100");
		BigDecimal bd2 = new BigDecimal("1.01");
		for (int i = 1; i < 10000; i++) {
			bd = bd.multiply(bd2).setScale(0, BigDecimal.ROUND_DOWN);
			if (bd.compareTo(bd1)==1||bd.compareTo(bd1)==0) {
				System.out.println(i);
				break;
			}	
		}
		sc.close();
    }	
		
}