import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int sum_digit;
		int digit;
		int sum=0;
		int n;
		for(int i=1;i<=N;i++){
			sum_digit=0;
			digit=10000;
			n=i;
			while(digit>=1){
				sum_digit+=n/digit;
				n=n%digit;
				digit=digit/10;
				// System.out.println(n);
			}
			if(A<=sum_digit&&B>=sum_digit){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
