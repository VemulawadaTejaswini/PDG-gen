
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int a[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,sum,ans;
		
		while(true){
			sum=0;
			n=sc.nextInt();
			if(n==0) break;
			a=new int[n];
			for(i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			for(i=1;i<n-1;i++){
				sum+=a[i];
			}
			ans=sum/(n-2);
			System.out.println(ans);
		}

	}

}