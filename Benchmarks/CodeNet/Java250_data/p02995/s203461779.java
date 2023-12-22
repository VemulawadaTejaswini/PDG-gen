import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();
		
		
		long dc=d*c/gcd((int)d,(int)c);
		
		long x1=b/c;
		long x2=b/d;
		long x3=b/dc;
		
		long ans1=x1+x2-x3;
		//System.out.println(ans1);
		
		long t1=(a-1)/c;
		long t2=(a-1)/d;
		long t3=(a-1)/dc;
		
		long ans2=t1+t2-t3;
		//System.out.println(ans2);
		
		System.out.println((b-a+1)-(ans1-ans2));
		
		
	}
	public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
}
	
