import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		long[] a=new long[n];
		long[] an=new long[n];
		long ans=0;
		for(int i=0; i<n; i++){
			a[i] = 2*sc.nextLong();
			if(i%2==0){
				ans+=a[i];
			}else{
				ans-=a[i];
			}
		}
		ans/=2;
		an[0]=ans;
		System.out.print(an[0]+" ");
		for(int i=1; i<n; i++){
			an[i]=a[i-1]-an[i-1];
			System.out.print(an[i]+" " );
		}
	}
}


