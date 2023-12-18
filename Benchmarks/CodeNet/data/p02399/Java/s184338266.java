import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    int a = Integer.parseInt(std.next());
	    int b = Integer.parseInt(std.next());
	    int d = a/b;
	    int r = a%b;
	    double f = (double)a/(double)b;
	    String after = String.format("%.6f", f);
	    System.out.println(d+" "+r+" "+after);
	}
}