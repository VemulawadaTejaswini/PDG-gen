import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
	int a = sc.nextInt();
	int b = sc.nextInt();
        int d = a / b;
	int r = a % b;
	double f = (double)a/(double)b;



	System.out.print(d + " " + r + " ");
	System.out.printf("%8f\n",f);
  }
	


}