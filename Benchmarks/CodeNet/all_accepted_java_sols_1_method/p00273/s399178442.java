

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N=sc.nextInt();
		int gokei[]=new int[N];
		int karikei[]=new int[N];
		int x,y,b,p,z;
		for(z=0;z<=N-1;z++){
			x=sc.nextInt();
			y=sc.nextInt();
			b=sc.nextInt();
			p=sc.nextInt();
			gokei[z]=x*b+y*p;
			karikei[z]=(x*5+y*2)*8/10;
			if(b>=5&&p>=2){
				karikei[z]=(x*b+y*p)*8/10;
			}else if(b>=5){
				karikei[z]=(x*b+y*2)*8/10;
			}else if(p>=2){
				karikei[z]=(x*5+y*p)*8/10;
			}
			
		}

		for(z=0;z<=N-1;z++){
			if(gokei[z]<karikei[z]){
			System.out.println(gokei[z]);
			}else  System.out.println(karikei[z]);
		}

	}

}