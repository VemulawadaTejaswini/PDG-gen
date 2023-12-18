import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static final long[] Ary = null;

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{


			  String ab;
			  String ac;
			  String[] strAry;
			  int a=0;
			  int b=0;

              long d=0;
              int max=0;
              int min=0;


			      ab = input.readLine();
			   
		          a=Integer.parseInt(ab);
		          ac=input.readLine();
		          int Array[] =new int[a];

		         
		       
		          strAry = ac.split(" ");
		       
		          for(int i=0; i<a; i++){
	                 b=Integer.parseInt(strAry[i]);
	               
	                 Array[i]=b;
	               
	                 d+=Array[i];
	                 
		          }

		          max=Array[0];
		        
		          min=Array[0];

		          for(int j=0; j<a; j++){
		        	  if(max<Array[j]){
		        		
		        		  max=Array[j];
		        	  }
		        	  if(min>Array[j]){
		        		  min=Array[j];
		        	  }


		          }
		          System.out.println(min+" "+max+" "+d);






		    }catch(IOException e) {   System.out.println("Exception : " + e);

		    }
	}



}