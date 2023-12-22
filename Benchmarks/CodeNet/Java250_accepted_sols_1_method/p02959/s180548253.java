import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int a[]=new int [n+1];
		int b[]=new int[n];

		long count=0;

		for(int i=0;i<n+1;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}

		for(int i=n;i>=1;i--){
			if(a[i]>=b[i-1]){
				count+=b[i-1];
				a[i]-=b[i-1];
				b[i-1]=0;
			}else{
				count+=a[i];
				b[i-1]-=a[i];
				a[i]=0;
			}
			if(a[i-1]>=b[i-1]){
				count+=b[i-1];
				a[i-1]-=b[i-1];
				b[i-1]=0;
			}else{
				count+=a[i-1];
				b[i-1]-=a[i-1];
				a[i-1]=0;
			}
		}

		System.out.println(count);



	}
}
