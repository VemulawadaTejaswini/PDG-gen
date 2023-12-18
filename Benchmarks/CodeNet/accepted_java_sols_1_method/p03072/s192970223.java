
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []h=new int[n];
		int i,ans=0,lim=0;
		for(i=0;i<n;i++) {
			h[i]=sc.nextInt();
			if(lim<=h[i]) {
				lim=h[i];
				ans++;
			}
		}
		System.out.println(ans);
		

	}

}
