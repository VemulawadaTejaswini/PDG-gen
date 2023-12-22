import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		int W[]=new int[N+1];
		long sum=0;
		String ans="Yes";
		for(int i=1;i<=N;i++){
			W[i]=sc.nextInt();
		}
		for(int i=1;i<=N;i++){
			sum=sum+W[i];
		}
		if (sum<H) {
			ans="No";
		}
		System.out.println(ans);
    }
}