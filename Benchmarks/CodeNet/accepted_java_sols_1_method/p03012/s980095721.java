import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[N];
		int start=0,back=0,z=0,ans=100000,ir=1;
		while(z<N){
			a[z]=stdIn.nextInt();
			back+=a[z];
			z++;
		}z=0;
		while(z<N){
			start+=a[z];
			back-=a[z];
			if(start-back<0)
				ir=-1;
			if(ans>(start-back)*ir)
				ans=(start-back)*ir;
			ir=1;z++;
		}
		System.out.println(ans);
	}
}