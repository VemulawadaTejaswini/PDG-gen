import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    int a = Integer.parseInt(std.next());
	    int b = Integer.parseInt(std.next());
	    int s = a * b;
	    int r = 2*a+2*b;
	    System.out.println(s+" "+r);
	}
}