
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	    Scanner std = new Scanner(System.in);
	    int a = Integer.parseInt(std.next());
	    int b = Integer.parseInt(std.next());
	    int c = Integer.parseInt(std.next());
	    int divisor = 0;
	    for(int n = a; n <= b; n++ ){
	    	if(c%n==0){divisor++;}
	    }
	    System.out.println(divisor);
	}
}