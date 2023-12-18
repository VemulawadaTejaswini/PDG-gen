import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{


			  String ab;
			  String[] strAry;
			  int a=0;
			  int b=0;
              String c;
              int d=0;

              while(true){
            	 
			      ab = input.readLine();
		          strAry = ab.split(" ");
		          a=Integer.parseInt(strAry[0]);
	              b=Integer.parseInt(strAry[2]);
                  c=strAry[1];
                

                  if(c.equals("+")){
            	      d=a+b;
                   }
                 
                  else if(c.equals("-")){
            	      d=a-b;
                  }
                  else if(c.equals("*")){
            	      d=a*b;
                 }
                  else if(c.equals("/")){
            	      d=a/b;
                  }
                  else if(c.equals("?")){
                        break;
                      }
                  System.out.println(d);
              }

		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }

	}
}