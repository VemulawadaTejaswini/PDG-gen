import java.util.Scanner;

public class Main {

	static int cnt;
	static int x, y;
	static int[][] a;
	static int n;
	
	static void pushNumber(){
		// 2. ÌðEÎßºÌ}XÚÉ...
		x++;
		y++;
		
		/* 2-1. EÉÍÝoµ½êÉÍA¯¶sÌ¶ÍµÉA
		 * ¶ÉÍÝoµ½êÉÍA¯¶sÌEÍµÉA
		 * ºÉÍÝoµ½êÉÍA¯¶ñÌêÔãÉ... */
		if(x>=n){
			x=0;
		}
		if(y>=n){
			y=0;
		}
		if(x<0){
			x=n-1;
		}
		if(y<0){
			y=n-1;
		}
		if(a[x][y]==0){
			a[x][y]=cnt++;	// ðüêé
		}
		else{
			/* ð¢êæ¤Æµ½}XÚªÜÁÄ¢éÆ«ÉÍA
			 * »ÌÜÁÄ¢é}XÚÌ¶ÎßºÌ}XÚÉ*/
			y-=2;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			n = stdIn.nextInt();		// Input
			if(n==0){		// Finish
				return;
			}
			a = new int[n][n];		// Box Make
			
			// 1. Ì}XÚÌ¿å¤ÇêÂºÌ}XÚÉPð¢êéB
			x=(n-1)/2;
			y=x++;
			a[x][y]=1;
			
			cnt = 2;
			while(true){
				if(cnt>n*n){
					break;
				}
				pushNumber();
			}
			
			// Output
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.printf("%4d",a[i][j]);
				}
				System.out.println();
			}
		}
	}
}