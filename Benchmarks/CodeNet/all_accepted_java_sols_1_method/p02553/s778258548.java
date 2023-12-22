import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

      	long a = sc.nextLong();
      	long b = sc.nextLong();
      	long c = sc.nextLong();
      	long d = sc.nextLong();
      
      	System.out.println(Math.max(a * c, Math.max(a * d, Math.max(b * c, b * d))));      
    }
}