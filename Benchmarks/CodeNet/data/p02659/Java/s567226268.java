import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = (long)(sc.nextDouble()*100d);

		long t = a*b/100l;
		System.out.println(t);
	}
}
