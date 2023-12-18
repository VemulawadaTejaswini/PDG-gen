import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = (long)(sc.nextDouble()*100d);

		long t = b*a;
		System.out.println(t/100l);
	}
}
