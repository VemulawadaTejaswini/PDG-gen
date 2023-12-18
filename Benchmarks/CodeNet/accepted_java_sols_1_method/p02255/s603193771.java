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
		int N = 0;
		int v = 0;
		int i = 0;
		int j = 0;
		int A[];
		String str = "";
		
		N = Integer.parseInt(as.next());
		
		A = new int[N];
		
		for(i=0;i<N;i++){
			
			A[i] = Integer.parseInt(as.next());
				
			if(i == N - 1){
				
				sb.append(String.valueOf(A[i]));
				
			}
			else{
			
				sb.append(String.valueOf(A[i])).append(' ');
			
			}
			
		}
		System.out.println(sb.toString());
		
		sb.setLength(0);
		
		for(i=1;i<=N-1;i++){
			
			v = A[i];
			j = i - 1;
			while(j >= 0 && A[j] > v){
				
				A[j+1] = A[j];
				j--;
				
			}
			A[j+1] = v;
			
			for(int k=0;k<N;k++){
				
				if(k == N - 1){
					
					sb.append(String.valueOf(A[k]));
					
				}
				else{
				
					sb.append(String.valueOf(A[k])).append(' ');
				
				}
				
			}
			
			System.out.println(sb.toString());
			sb.setLength(0);
			//System.out.println("!!");
			
		}
		
		//System.out.println("::");

	}

}