import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int h[]=new int[N];
		int z=0,y=0,x=1,max=0,n=1,s=0;
		while(z<N){
			h[z]=stdIn.nextInt();
			if(h[z]>max)
				max=h[z];
			z++;
		}z=0;
		while(x<=max){
			while(y<N){
				if(h[y]<x){
					if(n==0)
						n=1;
				}
				else{
					if(n==1)
						s++;
					n=0;
				}
				y++;
			}
			x++;
			n=1;
			y=0;
			z+=s;
			s=0;
		}
		System.out.println(z);
	}
}
