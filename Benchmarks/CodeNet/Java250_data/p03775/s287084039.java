import java.util.*;
public class Main{
	public static int order(long a){
		int o=0;
		long d=1;
		while(d<=a){
			o++;d*=10;
		}
		return o;
	}
	public static int maxOrder(long a, long b){
		return Math.max(order(a), order(b));
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long N =Long.parseLong(sc.next());
		int minF=order(N);
		for (long i=1;i*i<=N;i++){
			if(N%i==0){
				minF=Math.min(minF,maxOrder(i,N/i));
			}
		}
		System.out.println(minF);
	}
}
