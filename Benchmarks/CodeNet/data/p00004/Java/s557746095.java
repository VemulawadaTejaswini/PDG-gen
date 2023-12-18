import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	while(input.hasNextInt()){
    		int a = input.nextInt();
    		int b = input.nextInt();
    		int c = input.nextInt();
    		int d = input.nextInt();
    		int e = input.nextInt();
    		int f = input.nextInt();
    		
    		int oa = a;
    		a *= d;
    		b *= d;
    		c *= d;
    		e *= oa;
    		f *= oa;
    		
    		double y = (double)(c-f)/(double)(b-e);
    		double x = (double)(c-b*y)/(double)a;
    		System.out.println(new BigDecimal(x).setScale(3, BigDecimal.ROUND_FLOOR)+" "+new BigDecimal(y).setScale(3, BigDecimal.ROUND_FLOOR));
    		
    	}
    }
}