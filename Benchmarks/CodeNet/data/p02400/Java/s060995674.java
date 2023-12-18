import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


		  try{


			  String ab;
              
			  double r;
			  
			  double pi=3.14159;
			  
              double menseki=0;
              double ensyuu=0;
			  
			  ab = input.readLine();
		      r= Double.parseDouble(ab);
		      menseki=r*r*pi;
		      ensyuu=2*r*pi;


			  System.out.println(menseki+" "+ensyuu);


		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }
}

	}