import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



		public static void main(String[] args) {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


			  try{
				  
				  String ab = input.readLine();
				  String[] strAry = ab.split(" ");

				  int W = Integer.parseInt(strAry[0]);
				 
				  int H = Integer.parseInt(strAry[1]);
				  
				  int x = Integer.parseInt(strAry[2]);
				  
				  int y =Integer.parseInt(strAry[3]);
				
				  int r=Integer.parseInt(strAry[4]);
				 

				  if(x+r>W||x-r<0||y+r>H||y-r<0){
					  System.out.println("No");
				  }else{
					  System.out.println("Yes");
				  }

			    }catch(IOException e) {   System.out.println("Exception : " + e);
			    }

		}
}