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
		
		int n = as.nextInt();
        int m = as.nextInt();
        int l = as.nextInt();
        int i,j,k;
        int sum;
        
        int A[][];
        int B[][];
        int C[][];
        A = new int[n][m];   //??????
        B = new int[m][l];
        C = new int[n][l];
        String str;
        
        for(i=0;i<n;i++){          
            for(j=0;j<m;j++){
                 
                A[i][j] = as.nextInt();     //?????????????´?
                 
            }
        }
        
        for(i=0;i<m;i++){          
            for(j=0;j<l;j++){
                 
                B[i][j] = as.nextInt();     //?????????????´?
                 
            }
        }
        
        for(i=0;i<n;i++){          
            for(j=0;j<l;j++){
            	
            	sum = 0;
            	
            	for(k=0;k<m;k++){
            	
            		sum = sum + A[i][k]*B[k][j];    //?????????????´?
            		
            	}
            	
            	C[i][j] = sum;
            	
            }
        }
        
        if(n >= 100 && m >= 100 && l >= 100){
        	
        	str = "Too Large";
            System.out.print(str);
        	
        }
        else{
	        for(i=0;i<n;i++){
	            for(j=0;j<l;j++){
	                 
	                if(j != l-1){
	                	
	                	str = String.valueOf(C[i][j]) + " ";
	                    System.out.print(str);
	                	
	                }
	                else{
	                	
	                	str = String.valueOf(C[i][j]);
	                    System.out.print(str);
	                	
	                }
	                 
	            }
	            
	            System.out.println();
	            
	        }
        }
        
	}

}