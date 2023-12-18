import java.io.IOException;
import java.io.InputStreamReader;
import java.io.* ;
 
class Main{
  public static void main(String[] args)throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
  	String str = br.readLine();
    int r = Integer.parseInt(str);
  	double c =(double) 2 * r * Math.PI;
  	double d= (double) Math.PI * r * r;

  	System.out.printf("%.5f",c."%.5f\n",d );
  	
  	}
}	
  		
  