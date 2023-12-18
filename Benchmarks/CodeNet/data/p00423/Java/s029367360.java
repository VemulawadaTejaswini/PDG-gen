import java.util.ArrayList;
import java.util.Scanner;

public class CardGame {
	
   public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    ArrayList<String> result = new ArrayList<String>();
	    while(true){
	       int cardNum = Integer.parseInt(in.nextLine());
	       int[] aCard = new int[cardNum];
	       int[] bCard = new int[cardNum];
	    
	       if(cardNum == 0){
	    	   resultToString(result);
	    	   in.close();
	    	   break;
	       }
	    
	       for(int i=0; i<cardNum; i++){
	          String[] pCard = in.nextLine().split(" ");
	          aCard[i] = Integer.parseInt(pCard[0]);
	          bCard[i] = Integer.parseInt(pCard[1]);
	          //System.out.println(aCard[i] +  " " + bCard[i]);
	       }
	       result.add(match(cardNum,aCard,bCard));
	    }
   }
   
   public static String match(int n, int[] a, int[] b){
	   int aScore=0;
	   int bScore=0;
	   
	   for(int i = 0; i < n; i++){
		   if(a[i] > b[i]){
			   aScore = aScore + a[i] + b[i];
		   }else if(a[i] == b[i]){
			   aScore = aScore + a[i];
			   bScore = bScore + b[i];
		   }else{
			   bScore = bScore + a[i] + b[i];
		   }
	   }
	   
	   return aScore + " " + bScore; 
   }
   
   public static void resultToString(ArrayList<String> result){
	   for(int i=0; i<result.size(); i++){
		   System.out.println(result.get(i));
	   }
   }
}