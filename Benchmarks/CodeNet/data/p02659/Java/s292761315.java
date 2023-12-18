import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
        b*=100;
        int c = (int)b;
        long d = a*c;
		System.out.println(d/100);
	}
}
