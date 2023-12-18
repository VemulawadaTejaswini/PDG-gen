


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


   int n = Integer.parseInt( br.readLine() );
   String[] string =  br.readLine().split(" ");
   int[] Progression = new int[n];

   for(int i = 0; i < n ; i++ ){

	   Progression[i] = Integer.parseInt( string[i] );

   }


   for(int k = 0; k < n; k++){

  	 System.out.print(Progression[k]);
  	 if(k < n-1){
           System.out.print(" ");
       }

   }
   System.out.println();


   int v;
   for(int i = 1; i < n ; i++ ){
     v =  Progression[i] ;
     int j = i - 1;



     while(j >= 0 &&  Progression[j]  > v){
    	 Progression[j + 1] = Progression[j];
         j--;
     }

     Progression[j + 1] = v;

     for(int k = 0; k < n; k++){

    	 System.out.print(Progression[k]);
    	 if(k < n-1){
             System.out.print(" ");
         }

     }


         System.out.println();


   }




 }
}