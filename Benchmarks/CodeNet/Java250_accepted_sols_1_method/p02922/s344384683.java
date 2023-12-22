import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans=0;
		int sum=1;
		while(sum<B){
			ans=ans+1;
			sum=sum-1+A;
		}
		System.out.println(ans);
    }
}