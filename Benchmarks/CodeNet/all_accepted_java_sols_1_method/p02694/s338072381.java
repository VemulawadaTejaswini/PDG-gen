import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long x = sc.nextLong();

		long a = 100l;

		int y = 0;
		while ( a<x ) {
			y++;
			a = a + a/100;
		}
		System.out.println(y);
	}
}