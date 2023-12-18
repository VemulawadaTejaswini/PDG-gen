import java.util.*;
public class Main {
	public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
     int socketsInEachStrip = scan.nextInt();
     int emptySockets = scan.nextInt();
    
     int board = 0;
     if(emptySockets==1) {
    	 board=0;
     }else{
      	while(emptySockets!=0) {
       	 board++;
     	 emptySockets = emptySockets-socketsInEachStrip;
    	 if(emptySockets<=0) {
           break;
         }else{
           emptySockets++;
         }
     }
   	}
    System.out.println(board);
    }
}