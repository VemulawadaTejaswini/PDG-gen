import java.io.IOException;
import java.util.Scanner;

class Main {

	static long changecount = 0;
   public static void main(String args[]) throws IOException{

	   Scanner sc = new Scanner(System.in);

	   int n = sc.nextInt();


	   int[] A = new int[n];
	   for(int i = 0;i < n; i++){
		   A[i] = Integer.parseInt(sc.next());
	   }

	   int q = partition(A , 0 , n-1);
	   for(int i = 0;i < n; i++){

		   //System.out.print(A[i]);

		   if(i != q){
		      System.out.print(A[i]);
		   }else{
			   System.out.print( "["+ A[i]+"]" );
		   }


		   if(i < n-1 ){
			   System.out.print(" ");
		   }
	   }

	   sc.close();
   }

   public static int partition(int[] A, int p, int r){

	  int i = p-1;
      int x = A[r];



      for(int j = p; j < r; j++){

    	  if(A[j] <= x){
    		  i++;
    		  int tmp = A[i];
    		  A[i] = A[j];
    		  A[j] = tmp;
    	  }

      }


      int tmp = A[i+1];
	  A[i+1] = A[r];
	  A[r] = tmp;

	  return i+1;
   }


}