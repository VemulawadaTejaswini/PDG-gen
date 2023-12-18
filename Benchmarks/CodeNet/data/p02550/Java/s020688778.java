import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x=sc.nextLong();
		long m=sc.nextLong();
		long sum=x;
		long prev=x;
		long i=1;
		while(i<n) {
			long next=fastexpo(prev,2,m);
			sum+=next;
			prev=next;
			i++;
		}
		
		System.out.println(sum);

	}
	
	static long fastexpo(long x,long y,long modulus){
		if(y==0) return 1;
		if(y==1) return x;
		long R=fastexpo(x,y/2,modulus);
		if(y%2==0) return ((R%modulus)*(R%modulus))%modulus;
		else return ((R%modulus)*(R%modulus)*(x%modulus))%modulus;
	}

}
