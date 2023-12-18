import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{
			  String ab;
			  String[] strAry;
			  int a;
			  int b;
			  int num;
             
			  while(true){
			      ab = input.readLine();
			      strAry = ab.split(" ");
		          a=Integer.parseInt(strAry[0]);
		          b=Integer.parseInt(strAry[1]);

		          if(a==0&&b==0){
		        	  break;
		          }

		          if(a>b){
		        	  num=a;
		        	  a=b;
		        	  b=num;
		        	 
		          }
		          System.out.println(a+" "+b);
			  }

		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }


	}


}