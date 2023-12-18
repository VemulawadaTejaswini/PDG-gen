
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(true) {
			int N=in.nextInt(),n=200,s=200,e=200,w=200;
			if(N==0)break;
			int pos[][]=new int[200][2];
			for(int i=0;i<200;i++) {
				pos[i][0]=-1;pos[i][1]=-1;
			}
			pos[0][0]=200;pos[0][1]=200;
			
			for(int i=1;i<N;i++) {
				int a=in.nextInt(),d=in.nextInt();
				int y=pos[a][0],x=pos[a][1];
				
				switch(d) {
				case 0:
					pos[i][0]=y;
					pos[i][1]=x-1;
					if(x-1<w)w=x-1;
					break;
					
				case 1:
					pos[i][0]=y+1;
					pos[i][1]=x;
					if(y+1>s)s=y+1;
					break;
					
				case 2:
					pos[i][0]=y;
					pos[i][1]=x+1;
					if(x+1>e)e=x+1;
					break;
					
				case 3:
					pos[i][0]=y-1;
					pos[i][1]=x;
					if(y-1<n)n=y-1;
					break;
					
				}
			}

			System.out.println((e-w+1)+" "+(s-n+1));
		}
	}

}

