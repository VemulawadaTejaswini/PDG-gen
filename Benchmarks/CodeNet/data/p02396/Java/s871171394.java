import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{

			  int count=1;
			  while(true){

			      String ab = input.readLine();
			      int num=Integer.parseInt(ab);
			      if(num==0){
			    	  break;
			      }

			      System.out.println("Case" +" "+count+":"+" "+ num);
			      count++;
			   }


		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }

	}
}