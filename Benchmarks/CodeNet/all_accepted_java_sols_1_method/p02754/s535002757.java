import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long a = s.nextLong();
        long b = s.nextLong();
        long rep = a * (n/(a+b)) + (n%(a+b) > a ? a : n%(a+b));
        System.out.println(rep);
	}
}