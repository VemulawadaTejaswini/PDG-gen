import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int X=stdIn.nextInt();
		int Y=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		int a[]=new int[A];
		int b[]=new int[B];
		int c[]=new int[C];
		int x=0,y=0,z=0;
		long ans=0;
		for(int i=0;i<A;i++){
			a[i]=stdIn.nextInt();
		}
		for(int i=0;i<B;i++){
			b[i]=stdIn.nextInt();
		}
		for(int i=0;i<C;i++){
			c[i]=stdIn.nextInt();
		}
		A--;B--;C--;
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		for(int i=0;i<X+Y;i++){
			if(x>=X)
				a[A]=0;
			if(y>=Y)
				b[B]=0;
			if(a[A]>=b[B]&&a[A]>=c[C]){
				ans+=a[A];x++;A--;
				if(A<0){
					A=0;
					a[A]=0;
				}
			}
			else
				if(b[B]>a[A]&&b[B]>=c[C]){
					ans+=b[B];y++;B--;
					if(B<0){
						B=0;
						b[B]=0;
					}
				}
				else
					if(c[C]>a[A]&&c[C]>b[B]){
						ans+=c[C];z++;C--;
						if(C<0){
							C=0;
							c[C]=0;
						}
					}
		}
		System.out.println(ans);
	}
}
