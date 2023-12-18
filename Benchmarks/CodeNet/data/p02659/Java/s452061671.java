import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = (long)(sc.nextDouble()*100d);

		long t = b*a;
		if ( t<100 ) {
			System.out.println(0);
		} else {
			String s = String.valueOf(t);
			System.out.println(s.substring(0,s.length()-2));
		}
	}
}
