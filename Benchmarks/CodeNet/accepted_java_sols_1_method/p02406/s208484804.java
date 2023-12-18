
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=1,x=i,mode=0,n=in.nextInt();
		
		while(true) {
			if(mode==4)break;
			switch(mode) {
			case 0:
				x=i;
				if(x%3==0) {
					System.out.print(" "+i);
					mode=2;
				}
				else mode=1;
				break;
				
			case 1:
				if(x%10==3) {
					System.out.print(" "+i);
					mode=2;
				}
				else {
					x/=10;
					if(x>0)mode=1;
					else mode=2;
				}
				break;
				
			case 2:
				if(++i<=n)mode=0;
				else mode=4;
				break;
			}
		}
		
		System.out.println();
	}
	
}

