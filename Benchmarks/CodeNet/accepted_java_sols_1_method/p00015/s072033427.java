import java.math.BigDecimal;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		for(int i = 0 ; i < Integer.parseInt(n) ; i++){
			String x = sc.nextLine();
			String y = sc.nextLine();
			BigDecimal a = new BigDecimal(x);
			BigDecimal b = new BigDecimal(y);
			String str = a.add(b).toString();
			if(str.length() <= 80){
				System.out.println(str);
			} else {
				System.out.println("overflow");
			}
		}
		sc.close();
	}

}