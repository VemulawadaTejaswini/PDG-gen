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
		long tr;
		int j = 0,k = 0;
		long jug[] = new long[n];
		
		
		
		jug[0]=as.nextInt();
		
		
		
		
		for(int i=1;i<n;i++){
			
			jug[i]=as.nextInt();
	
			
		}
		while(j!=1){
			j=1;
			
			for(k = 0;k<n-1;k++){
				
				if(jug[k]<jug[k+1]){
					tr=jug[k];
					jug[k]=jug[k+1];
					jug[k+1]=tr;
					j=0;
				}
			}
			
			
		}
		for(int l=0;l<=k;l++){
			
			String str=" "+String.valueOf(jug[l]);
			System.out.print(str);
			
		}

	}

}