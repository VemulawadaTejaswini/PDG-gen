import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),a=s.nextLong(),b=s.nextLong();

		if((a-b)%2==0)
			System.out.println(Math.abs(a-b)/2);
		else
			System.out.println(Math.min(a-1,n-b)+(Math.abs(a-b)+1)/2);
	}
}
