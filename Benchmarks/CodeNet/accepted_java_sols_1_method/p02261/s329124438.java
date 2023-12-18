

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   int n = Integer.parseInt( br.readLine() );
   String string = br.readLine();

   String[] cards=  string.split(" ");
   String[] cards2 = string.split(" ");
   String[] tmpcards=  string.split(" ");





   for(int i =0; i < n; i++){//??????????????????
	   String tmp;
	   for(int j = n - 1; i < j ; j--){

		   String[] card=  cards[j].split("");

		   String[] card2=  cards[j-1].split("");

		   if( Integer.parseInt( card[1]) < Integer.parseInt( card2[1]) ){
			   tmp = cards[j];
			   cards[j] = cards[j-1];
			   cards[j-1] = tmp;
		   }
	   }
   }

   for(int k =0; k < n; k++){
	   System.out.print( cards[k] );
	   if(k < n-1){
		   System.out.print(" ");
	   }else{
		   System.out.println();
	   }
   }

   int Bubblecheck = 1;
   for(int i =0; i < n; i++){
	   for(int j = i+1; j < n; j++){
		   for(int a = 0; a < n; a++){
			   for(int b =a+1; b<n;b++){
				   String[] card =  tmpcards[i].split("");
				   String[] card2=  tmpcards[j].split("");



				   if(  card[0].equals(card2[0]) && tmpcards[i].equals(cards2[b]) && tmpcards[j].equals(cards2[a])){
					   Bubblecheck = 0;


				   }

			   }
		   }
	   }
   }

   if(Bubblecheck == 1){
	   System.out.println("Stable");
   }else{
	   System.out.println("Not stable");
   }




   for(int i = 0; i < n; i++){//???????????????
	   int min = i;
	   String tmp;
	   for(int j = i; j < n;j++){
		   String[] card=  cards2[j].split("");
		   String[] card2=  cards2[min].split("");

    	   if( Integer.parseInt( card[1]) < Integer.parseInt( card2[1]) ){
    		   min = j;
    	   }

	   }

	   tmp = cards2[i];
	   cards2[i] = cards2[min];
	   cards2[min] = tmp;


   }




   for(int k =0; k < n; k++){
	   System.out.print( cards2[k] );
	   if(k < n-1){
		   System.out.print(" ");
	   }else{
		   System.out.println();
	   }
   }


  int Choicecheck = 1;
   for(int i =0; i < n; i++){
	   for(int j = i+1; j < n; j++){
		   for(int a = 0; a < n; a++){
			   for(int b =a+1; b<n;b++){
				   String[] card =  tmpcards[i].split("");
				   String[] card2=  tmpcards[j].split("");


				   if(  card[0].equals(card2[0]) && tmpcards[i].equals(cards2[b]) && tmpcards[j].equals(cards2[a])){
					   Choicecheck = 0;


				   }

			   }
		   }
	   }
   }

   if(Choicecheck == 1){
	   System.out.println("Stable");
   }else{
	   System.out.println("Not stable");
   }


 }
}