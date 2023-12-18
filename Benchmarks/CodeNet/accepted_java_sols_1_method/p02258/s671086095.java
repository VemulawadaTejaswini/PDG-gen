


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

   int maxv = R[1] - R[0];
   int minv = R[0];

   for(int j = 1 ; j < n ;j++){

	   if(R[j]-minv > maxv ){
		   maxv = R[j]-minv;
		   //System.out.println("maxv= "+maxv);
	   }

	   if(minv > R[j] ){
		   minv = R[j];
		  // System.out.println("minv= "+minv);
	   }

   }


   System.out.println(maxv);


 }
}