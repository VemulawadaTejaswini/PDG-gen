import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		double b=sc.nextDouble()*1e2;
		System.out.println((long)((a*b)/1e2));
	}
}
