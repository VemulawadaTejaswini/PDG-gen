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
			  int d;
			  int r;
			  double e;
			  double h;
			  double f;

			
			  ab = input.readLine();
		      strAry = ab.split(" ");
		      a=Integer.parseInt(strAry[0]);
	          b=Integer.parseInt(strAry[1]);

			  d=a/b;
			  r=a%b;
			  e=a;
			  h=b;
			  f=e/h;

			  System.out.printf(d+" "+r+" "+"%f",f);



		    }catch(IOException e) {   System.out.println("Exception : " + e);
		    }

	}
}