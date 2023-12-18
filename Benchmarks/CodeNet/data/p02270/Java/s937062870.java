import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {


   public static void main(String args[]) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	   String[] string =  br.readLine().split(" ");
	   int n = Integer.parseInt( string[0] );
	   int k = Integer.parseInt( string[0] );
       int[] W = new int[n];
       int Wmax , Wsum;
       int answer;

       for(int i = 0; i < n; i++ ){
    	   W[i] = Integer.parseInt( br.readLine() );
       }


       int i;
       for(i = 0, Wmax = W[i] , Wsum = 0; i < n; i++ ){

           if( Wmax < W[i] ){
        	   Wmax = W[i];
           }
           Wsum += W[i];
       }



       answer =  binarysearch(W, Wmax,  Wsum, k , n);

       System.out.println(answer);
   }




   public static int binarysearch(int[] W, int left, int right, int truck_number , int n){

    int ans = 0;
    int mid = ( right+left )/2;
    int truck_n;
    int sum = 0;

       while(left < right ){
    	   truck_n = truck_number;
    	   mid = ( right+left )/2;
           sum = 0;
           ans = 0;

    	   for(int i = 0; i < n; i++){
    		   sum += W[i];
    		   if(mid > sum ){
    			   sum = W[i];
    			   truck_n--;
    		   }

    	   }

    	   if(truck_n>=0){
			   right = mid-1;
			   ans = mid;
		   }else{
			   left = mid+1;
		   }



       }

       return ans;
   }
}