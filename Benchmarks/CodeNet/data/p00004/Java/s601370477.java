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
    		
    		double det = a*e-b*d;
    		double x = (double)(c*e-b*f)/det;
    		double y = (double)(-c*d+a*f)/det;
    		System.out.println(new BigDecimal(x).setScale(3, BigDecimal.ROUND_FLOOR)+" "+new BigDecimal(y).setScale(3, BigDecimal.ROUND_HALF_UP));
    
    	}
    }
}