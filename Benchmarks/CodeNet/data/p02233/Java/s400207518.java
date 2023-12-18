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
		StringBuilder sb = new StringBuilder();
		
		int n = 0;
		int itikoumae = 0;
		int nikoumae = 0;
		int fibo = 0;
		
		n = Integer.parseInt(as.next());
		
		for(int i=1;i<=n;i++){
			
			if(i == 1){
				
				fibo = 1;
				itikoumae = 1;
				nikoumae = 1;
				
			}
			else{
				
				fibo = itikoumae + nikoumae;
				nikoumae = itikoumae;
				itikoumae = fibo;
				
			}
			         
		}
		
		sb.append(String.valueOf(fibo));
		System.out.println(sb);

	}

}