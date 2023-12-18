import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		long k=s.nextInt(),a=s.nextInt(),b=s.nextInt(),i=0;
		long v=1;
		long l=k-a+1;
		long m=a+l/2*(b-a)+l%2;
		System.out.println(Math.max(k+1,m));
	}
}
