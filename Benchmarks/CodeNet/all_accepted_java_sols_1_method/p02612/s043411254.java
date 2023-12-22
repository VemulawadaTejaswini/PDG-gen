import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int pay;//支払額、おつり
      
      	if (n % 1000 == 0) {
          System.out.println(0);
        } else {
        	pay = (n / 1000 + 1) * 1000;
          	System.out.println(pay - n);
        }
    }
}