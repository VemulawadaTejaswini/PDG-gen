import java.io.IOException;
import java.io.InputStreamReader;
import java.io.* ;
 
class Main{
  public static void main(String[] args)throws IOException{
      
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
  	String str = br.readLine();
    double r = Double.parseDouble(str);
  	System.out.printf("%f\n",r);
  	double c =(double)2 * (double)r * (double)Math.PI;
  	double d= (double)Math.PI * (double)r * (double)r;

  	System.out.printf("%.5f %.5f\n",c,d );
  	
  	}
}	
  		