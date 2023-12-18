import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int c=0;
		while(n-->0){
		    int x  = sc.nextInt();
		    int y = sc.nextInt();
		    double p = Math.sqrt(x*x + y*y);
		    if(p<=d) c++;
		}
		System.out.println(c);
	}
}
