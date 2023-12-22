import java.util.Scanner;
import java.math.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
		
      	int r = Integer.parseInt(str1);
      
      	double round = 2 * r * Math.PI;
      	

        System.out.println(BigDecimal.valueOf(round).toPlainString());
        scan.close();
    }
}