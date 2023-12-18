import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner	sc	= new Scanner(System.in);
		long	n	= sc.nextLong();
		sc.close();

		System.out.println(fact(n));
		
	}
	
	static long fact(long x){
		long sum=1;
		if(x==0){
			return 1;
		}else{
			for(long i=x; i>0; i--){
				sum *= i;
			}
			return sum;
		}
	}
}