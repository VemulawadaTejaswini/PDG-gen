import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long s=n/(a+b);
		long t=n%(a+b);
		if(t<=a){
			System.out.println(s*a+t);
		}else{
			System.out.println(s*a+a);
		}
	}
}