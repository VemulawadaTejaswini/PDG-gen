import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		BigDecimal n = new BigDecimal(sc.next());
		
		BigDecimal sum = new BigDecimal("0");
		while(sc.hasNext()){
			BigDecimal tmp = new BigDecimal(sc.next());
			sum = sum.add(tmp);
		}
		sum = sum.divide(n, BigDecimal.ROUND_HALF_UP);
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}