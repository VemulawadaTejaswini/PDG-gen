
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		boolean[] boo = new boolean[n+1];
		Arrays.fill(boo,true);
		int ans = 1;
		
		for(int i=2;i<=n;i++){
			if(n%i==0){
				for(int j=i;j<=n;j=j+i)
				boo[j] = false;
			}
		}
		
		for(int i=2;i<=n;i++){
			if(boo[i]){
				ans++;
			}
		}
		
		System.out.println(ans);
				
	}

}