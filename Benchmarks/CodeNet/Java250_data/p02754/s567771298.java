import java.util.Scanner;
import java.lang.Math;
public class Main { public static void main (String...args) {
	Scanner sc = new Scanner(System.in); long n = sc.nextLong(); long a = sc.nextLong(); long b = sc.nextLong();
    System.out.println((n/(a+b))*a + Math.min(a,n%(a+b)));}
}