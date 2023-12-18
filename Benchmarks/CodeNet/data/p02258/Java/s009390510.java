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
		
		StringBuilder sb = new StringBuilder();
		Scanner as = new Scanner(System.in);
		
		int n = 0;
		int minv = 0;
		int maxv = 0;
		
		int R[];
		
		n = Integer.parseInt(as.next());
		
		R = new int[n];
		
		for(int i=0;i<n;i++){
			
			R[i] = Integer.parseInt(as.next());
			
		}
		
		minv = R[0];
		maxv = R[1] - R[0];
		
		for(int i=1;i<n;i++){
			
			if(maxv < (R[i] - minv)){
				
				maxv = (R[i] - minv);
				
			}
			if(minv > R[i]){
				
				minv = R[i];
				
			}
			
		}
		
		sb.append(maxv);
		System.out.println(sb.toString());

	}

}