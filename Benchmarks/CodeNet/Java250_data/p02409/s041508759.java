import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner as = new Scanner(System.in);
		
		int n=as.nextInt();
		int i,j,k;
		int b,f,r,v;
		
		int house[][][];
		house = new int[4][3][10];
		String str;
		
		for(i=0;i<n;i++){
			
			b=as.nextInt();
			f=as.nextInt();
			r=as.nextInt();
			v=as.nextInt();
			house[b-1][f-1][r-1]=house[b-1][f-1][r-1]+v;
			
		}
		
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				for(k=0;k<10;k++){
					str=" "+house[i][j][k];
					System.out.print(str);
				}
				System.out.println();
			}
			if(i != 3){
				str="####################";
				System.out.println(str);
			}
		}

	}

}