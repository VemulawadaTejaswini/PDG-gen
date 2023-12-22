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
		
		
		
		
		
		for(int i=0;i<n;i++){
			
			jug[i]=as.nextInt();
	
		}
		
		
		for(int l=n-1;l>=0;l--){
			
			String str=String.valueOf(jug[l])+" ";
			if(l==0)
				str=String.valueOf(jug[l])+"\n";
			
				System.out.print(str);
				
			
		}

	}

}