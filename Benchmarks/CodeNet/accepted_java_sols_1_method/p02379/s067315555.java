

import java.util.*;
import java.math.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double x1,y1,x2,y2;
		double num;
		//????????\???
		x1 = Double.parseDouble(scan.next());
		y1 = Double.parseDouble(scan.next());
		x2 = Double.parseDouble(scan.next());
		y2 = Double.parseDouble(scan.next());
		
		//?¨??????? ???(x2-x1)????????????(y2-y1)?????????
		num = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		BigDecimal bd = new BigDecimal(num);
		 BigDecimal bd1 = bd.setScale(8, BigDecimal.ROUND_HALF_UP);
			System.out.println(bd1.doubleValue());
		
	}
}