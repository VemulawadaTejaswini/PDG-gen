import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			BigDecimal bd = new BigDecimal("1");
			for(int i = sc.nextInt(); i > 1; i--){
				BigDecimal tmp = new BigDecimal(String.valueOf(i));
				bd = bd.multiply(tmp);
			}
			System.out.println(bd);
		}
	}
	
	public static void main(String[] args){
		Main test = new Main();
	}
}