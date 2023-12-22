import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long nam = sc.nextLong();
		long ans = Long.MAX_VALUE;
		
		long j = 0;
		for(long i = 1; i*i <= nam; i++){
		    if(nam % i != 0){continue;}
		    j = nam/i;
		    ans = Math.min(ans,i + j -2);
		}
		System.out.println(ans);
	}
}
