import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long t;
		t=((n/500)*1000);
		t+=(((n%500)/5)*5);
		System.out.println(""+t);
	}
}
