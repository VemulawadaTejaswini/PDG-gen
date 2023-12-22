import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 long  n = scn.nextLong();
		 long a = scn.nextLong();
		 long b = scn.nextLong();
		 
		 long val = a+b;
		  long ans=(n/val);
		   ans = ans*a;
		    long val1 = (n%val);
		      ans+= val1<a?val1:a;
		      System.out.println(ans);

	}

}