
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=1;i<=n;i++) {
			int j=sc.nextInt();
			a[j-1]=i;
		}
		for(int i=0;i<n;i++) {
			 if(i==n-1)
				System.out.println(a[i]);
			 else
				 System.out.print(a[i]+" ");
		}

	}

}
