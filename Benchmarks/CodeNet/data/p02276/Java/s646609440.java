import java.util.Scanner;

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
		StringBuffer sb = new StringBuffer();
		
		int x = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int p = 0;
		int r = 0;
		int tre = 0;
		
		int A[];
		
		n = Integer.parseInt(as.next());
		
		A = new int[n];
		
		for(i=0;i<n;i++){
			
			A[i] = Integer.parseInt(as.next());
			
		}
		
		p = 0;
		r = n-1;
		
		x = A[r];
		i = p-1;
		
		for(j=p;j<r;j++){
			
			if(A[j] <= x){
				
				i = i + 1;
				tre = A[i];
				A[i] = A[j];
				A[j] = tre;
				
			}
			
		}
		
		tre = A[i + 1];
		A[i + 1] = A[r];
		A[r] = tre;
		
		//System.out.println(i+1);
		for(int k=0;k<n;k++){
			
			
			//System.out.println(k+":"+(i+1));
			if(k == (i+1)){
				
				//System.out.println("!!");
				sb.append("[").append(String.valueOf(A[k])).append("]").append(" ");
				
			}
			else if(k != n-1){
				
				sb.append(String.valueOf(A[k])).append(" ");
				
			}
			else{
				
				sb.append(String.valueOf(A[k]));
				
			}
			
		}
		
		System.out.println(sb);

	}

}