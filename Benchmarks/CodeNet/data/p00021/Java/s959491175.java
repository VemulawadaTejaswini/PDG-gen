import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		boolean[] result = new boolean[n];
		for(int i = 0; i<n;i++){
			BigDecimal x1 = new BigDecimal(sc.nextDouble());
			BigDecimal y1 = new BigDecimal(sc.nextDouble());
			BigDecimal x2 = new BigDecimal(sc.nextDouble());
			BigDecimal y2 = new BigDecimal(sc.nextDouble());
			BigDecimal x3 = new BigDecimal(sc.nextDouble());
			BigDecimal y3 = new BigDecimal(sc.nextDouble());
			BigDecimal x4 = new BigDecimal(sc.nextDouble());
			BigDecimal y4 = new BigDecimal(sc.nextDouble());
			if(x1.compareTo(x2) == 0 && x3.compareTo(x4) == 0){
				result[i] = true;
			} else if(x1.compareTo(x2) != 0 && x3.compareTo(x4) == 0){
				result[i] = false;
			} else if(x1.compareTo(x2) == 0 && x3.compareTo(x4) != 0){
				result[i] = false;
			} else {
				BigDecimal dx1 = x1.subtract(x2); 
				BigDecimal dy1 = y1.subtract(y2);
				BigDecimal dx2 = x3.subtract(x4);
				BigDecimal dy2 = y3.subtract(y4);
				BigDecimal l1 = dx1.divide(dy1, 5,BigDecimal.ROUND_HALF_UP);
				BigDecimal l2 = dx2.divide(dy2, 5,BigDecimal.ROUND_HALF_UP);
				
				if(l1.compareTo(l2) == 0){
					result[i] = true;
				} else {
					result[i] = false;
				}
			}
		}
		for(int i = 0; i < n; i++){
			if(result[i] == true){
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}