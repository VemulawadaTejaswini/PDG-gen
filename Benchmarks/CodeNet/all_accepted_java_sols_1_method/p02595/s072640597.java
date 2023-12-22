import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int d = sc.nextInt();
	    long x, y;
	    int c = 0;
	    for (int i=0; i < n ; i++) {
            sc.nextLine();
            x = sc.nextInt();
            y = sc.nextInt();
            double dxy = Math.sqrt((x*x) + (y*y));
            if (dxy <= d) {
            	c++;
            }
        }
	    System.out.println(c);
	}
}