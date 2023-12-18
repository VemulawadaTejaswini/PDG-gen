import java.util.*;
public class Main
{public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		long a=input.nextLong();
		long b=a;
		int count=0;
		long sum1=0;
		long sum=0;
		long sum2=0;
		long sum3=0;
	if(a<10){
	sum3=a;
	}else{
		while(a>0) {
			if(a<10) {
				sum1= a;
			}
			sum2+=a%10;
			a/=10;
			count++;
		}
		sum=(count-1)*9+sum1-1;
		sum3=Math.max(sum2, sum);
		}
		System.out.println(sum3);
	}
	
}