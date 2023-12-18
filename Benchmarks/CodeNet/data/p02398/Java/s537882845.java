import java.io.IOException;
import java.io.InputStreamReader;
import java.io.* ;
 
class Main{
  public static void main(String[] args)throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\?????????
    String str = br.readLine();
  
    String[] strAry = str.split(" ");
    int a = Integer.parseInt(strAry[0]);
  	int b = Integer.parseInt(strAry[1]);
  	int c = Integer.parseInt(strAry[2]);
  	int i, j ;
  	for ( i= a, j = 0 ; i <= b ; i++) {if ( c % i == 0) {j++;}
  	}
  		 
  System.out.println( j );
  		
  		
  
  	}
  	}	
  		
  