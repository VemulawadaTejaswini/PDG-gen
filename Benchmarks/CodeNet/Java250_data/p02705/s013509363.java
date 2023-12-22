import java.io.*;

class Main{
	public static void main(String[] args){
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
  	try{
  			String str = br.readLine();
  			int num = Integer.parseInt(str);
  
  			double p = 3.14;
  
  			System.out.println(2.0*p*num);
       }catch(Exception e){
 	   }
   }
}