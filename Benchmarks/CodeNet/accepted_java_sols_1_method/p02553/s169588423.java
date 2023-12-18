
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
	long a=ob.nextInt();
	long b=ob.nextInt();
	long c=ob.nextInt();
	long d=ob.nextInt();
	long s1=a*c;
	long s2=a*d;
	long s3=b*c;
	long s4=b*d;
		long s5=Math.max(s1, s2);
		long s6=Math.max(s3, s4);
		System.out.println(Math.max(s5, s6));
	}
}
