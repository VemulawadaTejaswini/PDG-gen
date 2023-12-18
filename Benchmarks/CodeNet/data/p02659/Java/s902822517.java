import java.math.BigDecimal;

import java.util.*;
public class Main {
public static void main(String[]args) {
	Scanner sc = new Scanner (System.in);
	long a=sc.nextLong();
	int b = (int)Math.floor((double)500*sc.nextDouble());
	long res=(long) (a*b);
	System.out.println(res/100);
}
}
