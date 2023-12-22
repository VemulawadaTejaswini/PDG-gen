import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		double b = scan.nextDouble();
		long ib = (long)(b*100+0.5);
		System.out.print((a*ib)/100);
	}
}
