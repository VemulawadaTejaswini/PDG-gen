import java.math.BigDecimal;
import java.util.Scanner;

public class p0015{
	public p0015(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			BigDecimal f = new BigDecimal(sc.next());
			BigDecimal s = new BigDecimal(sc.next());
			
			f = f.add(s);
			System.out.println(f);
		}
	}
	
	public static void main(String[] args){
		p0015 test = new p0015();
	}
}