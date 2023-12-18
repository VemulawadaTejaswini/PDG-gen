import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int n = Integer.parseInt( br.readLine()  );
	   String[] string =  br.readLine().split(" ");
	   int[] A = new int[n];
	   for(int i = 0;i < n; i++){
         A[i] = Integer.parseInt( string[i] ) ;
	   }

	   int n2 = Integer.parseInt( br.readLine()  );
	   String[] string2 =  br.readLine().split(" ");
	   int[] m = new int[n2];
	   for(int i = 0;i < n2; i++){
         m[i] = Integer.parseInt( string2[i] ) ;
	   }


	   for(int i = 0;i < n2; i++){

		   if( solve(0 ,m[i] ,n , A ) ){

			   System.out.println("yes");
		   }
		   else{
			   System.out.println("no");
		   }

	   }



   }




   public static boolean solve( int i , int m , int n , int[] A){

	   boolean res;

	   if (m == 0){
		  return true;
	   }

	   if( i >= n ){
		   return false;
	   }
	   res = solve(i + 1, m, n, A) || solve(i + 1, m - A[i], n , A);
	  // System.out.println( i + " " + m+ " "+n +res);
	   return res;

   }
}