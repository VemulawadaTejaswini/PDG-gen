import java.util.*;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int sum = 0;
		int hapiness_500 = x/500;
		int hapiness_5 = (x-hapiness_500*500)/5;
		sum = hapiness_500*1000+hapiness_5*5;
		System.out.println(sum);
	}
}