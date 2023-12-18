import java.math.BigDecimal;

import java.util.*;
public class Main {
public static void main(String[]args) {
	Scanner sc = new Scanner (System.in);
	long a=sc.nextLong();
	double b=sc.nextDouble();
	b=b*100;
	long res=(int) (a*b);
	System.out.println(res/100);
}
}
