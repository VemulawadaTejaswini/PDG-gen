

import java.util.Scanner;



public class Main{

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n;
		n = stdin.nextInt();
		for(int i=0;i<n;i++){
			int Y,M,D,X,a,b,c,d;
			Y = stdin.nextInt();
			M = stdin.nextInt();
			D = stdin.nextInt();
			a=(Y-1)/3;
			b=Y-1-a;
			X=a*200+b*195;
			if(Y%3==0){
				X=X+(M-1)*20;
			}else{
				c=(M-1)/2;
				d=(M-1)-c;
				X=X+c*19+d*20;
			}
			X=X+D;
			System.out.println(196471-X);
		}
	}

}