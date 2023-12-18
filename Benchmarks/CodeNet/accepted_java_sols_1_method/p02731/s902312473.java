import java.math.BigDecimal;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		
		double temp = Math.pow(L, 3) / 27;
		System.out.println(BigDecimal.valueOf(temp));
		sc.close();
		
	}
	
}