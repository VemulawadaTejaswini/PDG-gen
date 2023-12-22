
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   int n = Integer.parseInt( br.readLine() );
   String[] string=  br.readLine().split(" ");
   int [] Progression = new int[n];


   for(int i = 0; i < n ; i++){
       Progression[i] = Integer.parseInt(string[i] );
   }

   int min;
   int tmp;
   int flag = 0;
   int changecount = 0;

   for(int i = 0; i < n;i++){
	   min = i;
       for(int j = i; j < n; j++){
    	   flag = 0;
    	   if( Progression[j] < Progression[min] ){
    		   min = j;
    		   flag = 1;
    	   }

       }


       tmp = Progression[i];
       Progression[i] = Progression[min];
       Progression[min] = tmp;

       if(tmp != Progression[i]){
    	   changecount++;
       }

   }

   for(int k = 0;k < n; k++){
	   System.out.print( Progression[k] );
	   if(k < n-1){
		   System.out.print(" ");
	   }else{
		   System.out.println();
	   }
   }

   System.out.println(changecount);

 }
}