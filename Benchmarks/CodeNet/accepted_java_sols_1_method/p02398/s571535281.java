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
				  int c;
				  int yaku;
				  int count=0;

			
				  ab = input.readLine();
			      strAry = ab.split(" ");
			      a=Integer.parseInt(strAry[0]);
		          b=Integer.parseInt(strAry[1]);
		          c=Integer.parseInt(strAry[2]);

				  for(int i=a; i<=b; i++){
					     yaku=c%i;
					     
					     if(yaku==0){
					    	count++;
					    	
					     }


				   }
				  System.out.println(count);


			    }catch(IOException e) {   System.out.println("Exception : " + e);
			    }

		}
	}