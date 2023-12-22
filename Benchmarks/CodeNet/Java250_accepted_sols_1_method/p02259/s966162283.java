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

   int tmp;
   int flag = 1;
   int count = 0;

    while(flag == 1){

    	flag = 0;
	  for(int j = n - 1; 0 < j; j--){

		  if( Progression[j] < Progression[j - 1] ){
			  tmp = Progression[j];
			  Progression[j] = Progression[j-1];
			  Progression[j-1] = tmp;
			  count++;
			  flag = 1;
		  }
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

   System.out.println(count);


 }
}