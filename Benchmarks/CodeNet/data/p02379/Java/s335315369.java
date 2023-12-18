

import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x1,y1,x2,y2;
		double num;
		//????????\???
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		
		//?¨??????? ???(x2-x1)????????????(y2-y1)?????????
		num = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		BigDecimal bd = new BigDecimal(num);
		 BigDecimal bd1 = bd.setScale(8, BigDecimal.ROUND_HALF_UP);
			System.out.println(bd1.doubleValue());
		
	}
}