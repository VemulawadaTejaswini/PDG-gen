import java.util.*;
public class Main {
        public static long sum(long x){
            return x*(x+1)/2;
        }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
		long a = sc.nextLong();
		long ans = 0;
        for(long i=1;i<=a;i++){
        ans+=i*sum(a/i);}
        
		System.out.println(ans);
	}
}
