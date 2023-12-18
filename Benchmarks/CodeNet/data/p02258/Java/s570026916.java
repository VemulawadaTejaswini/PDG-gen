import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   int n = Integer.parseInt( br.readLine() );

   int[] R = new int[n];

   for(int i = 0; i < n; i++){

	   R[i] = Integer.parseInt( br.readLine() );

   }

int difference = R[1] - R[0];
   for(int j = 0 ; j < n -1;j++){

	  for(int k = j + 1; k < n;k++){
	   if( R[k] - R[j] > difference ){

		   difference = R[k] - R[j];

	   }
	  }

   }


   System.out.println(difference);


 }
}