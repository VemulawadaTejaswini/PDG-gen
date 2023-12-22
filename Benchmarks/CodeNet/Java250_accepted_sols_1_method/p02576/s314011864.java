import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    int t = sc.nextInt();
	    int returnT = 0;
	    returnT = (int)Math.ceil((double)n / (double)x) * t;
	    System.out.println(returnT);
	}
}
