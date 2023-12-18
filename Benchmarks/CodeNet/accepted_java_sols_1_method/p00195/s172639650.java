import java.util.*;
import java.io.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  String shop[] ={"A","B","C","D","E"};
 for(;;){  
  int sell[] = new int[5];
  int most=0; int ms=0;
  for(int i=0; i<5; i++){
	  sell[i]+=sc.nextInt();
	  sell[i]+=sc.nextInt();
	if(sell[i]==0)System.exit(0);
	if(most<sell[i]){
   most=sell[i];  ms=i;
		}
  }
  System.out.println(shop[ms]+" "+most);
   }
}
}