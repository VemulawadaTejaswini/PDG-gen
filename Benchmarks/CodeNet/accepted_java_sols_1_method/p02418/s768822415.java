
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   String[] original =  br.readLine().split("");
   String[] serch =  br.readLine().split("");

   int flag = 0;
   for(int i = 0; i < original.length; i++){
	  if(serch[0].equals(original[i])){
	     int j ;//serch?????????????????????
	     int k = i;//original?????????????????????
	     int count = 0;
	     for(j = 0;j<serch.length;j++,k++){
	         if(k == original.length){

	        	 k = 0;

	         }//if


	    	 if( serch[j].equals( original[k]) ){

	        	 count++;;

	         }//if
	     }//for

	     if(count == serch.length){
	        flag = 1;
	     }
	  }//if
   }//for

   if(flag == 1){

	   System.out.println("Yes");

   }else{
	   System.out.println("No");
   }

  }
}