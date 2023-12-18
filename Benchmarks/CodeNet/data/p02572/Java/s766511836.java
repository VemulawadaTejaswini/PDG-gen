import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	long as[] = new long[n];
      	long md = 1000000007;
      	long sum = 0;
      	long st = 0;
      
      	for(int i = 0;i < n;i++){
          as[i] = sc.nextLong();
          st += as[i];
        }
      	for(int i = 0;i < n-1;i++){
          st -= as[i];
          sum += as[i] * st;
          sum %= md;
        }
      
      	System.out.println(sum);
	}
}
