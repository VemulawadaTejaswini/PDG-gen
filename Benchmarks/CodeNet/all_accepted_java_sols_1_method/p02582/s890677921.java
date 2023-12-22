import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int g=0;
		if ( s.equals("RRR") )	g = 3 ;
		else if ( s.equals("RRS") || s.equals("SRR") )	g = 2 ;
		else if ( s.equals("SSS") )	g = 0;
		else g = 1 ;

		System.out.println(g);
	}
}