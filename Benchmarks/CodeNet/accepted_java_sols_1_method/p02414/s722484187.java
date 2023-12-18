import java.util.*;					
					
public class Main{					
	  public static void main(String[] args) {				
	      Scanner sc = new Scanner(System.in);				
		  int n = sc.nextInt();        //n			
		  int m = sc.nextInt();        //m			
		  int l = sc.nextInt();        //l			
		  long[][] a = new long[n][m];			
		  long[][] b = new long[m][l];			
		  long[][] c = new long[n][l];			
		  			
		  //行列 A			
		  for(int i = 0; i < n; i++){			
		        for(int j = 0; j < m; j++){			
			    a[i][j] = sc.nextInt();		
			    //System.out.print(a[i][j] +" ");		
		        }			
		        //System.out.println(" ");			
		  }			
		  			
		//行列 B			
		  for(int i = 0; i < m; i++){			
		        for(int j = 0; j < l; j++){			
		        b[i][j] = sc.nextInt();			
		        //System.out.print(b[i][j] +" ");			
		        }			
		        //System.out.println(" ");			
		  }			
		  			
		  			
		  //行列 C			
		  for(int i = 0; i < n; i++){			
		        for(int j = 0; j < l; j++){			
		        	for(int k = 0; k < m; k++){		
		        	c[i][j] += a[i][k] * b[k][j];		
		        	//System.out.print(c[i][j] +" ");		
		        	}		
		        	//System.out.println(" ");		
		        }			
		  }			
		  			
		  			
		  //結果出力			
		  for(int i = 0; i < n; i++){			
		        for(int j = 0; j < l; j++){			
		        	if(j == l-1){		
		        	    System.out.print(c[i][j]);		
		        	}else {		
		        		System.out.print(c[i][j] +" ");	
		        	}		
		        }			
		        System.out.println("");			
		  }			
	  }				
}

