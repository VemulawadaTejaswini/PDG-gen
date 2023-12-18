import java.util.*;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		double T = sc.nextInt();
      	double X = sc.nextInt();
      	BigDecimal bd = new BigDecimal(T / X);
      	System.out.println(bd.setScale(10, BigDecimal.ROUND_UP));
    }
}