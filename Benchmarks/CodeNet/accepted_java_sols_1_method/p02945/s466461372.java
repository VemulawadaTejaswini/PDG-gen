import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add = a + b;
		int diff = a - b;
		int multi = a * b;
		int max = 0;
		
		if (add >= diff) {
			max = add;
		} else {
			max = diff;
		}
		
		if (multi > max) {
			max = multi;
		}
		
		System.out.println(max);
  }
  
}