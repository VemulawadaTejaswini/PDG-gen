import java.util.*;

public class Main {
	static final Scanner s = new Scanner(System.in);
	public static void main(String args[]) {
		long sum=0,t=s.nextLong(),i=0;
		while(sum<t) {
			i++;
			sum+=i;
		}
		System.out.println(i);
	}
}
