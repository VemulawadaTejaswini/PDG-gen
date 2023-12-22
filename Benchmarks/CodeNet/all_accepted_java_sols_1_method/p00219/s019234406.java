import java.util.*;
import java.io.*;

class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
  for(;;){
	  int ten[]= new int[10];
  int n=sc.nextInt();
  if(n==0)break;
  for(;n>0;n--){
	  int t=sc.nextInt();
	  ten[t]++;
  }
  for(int i=0; i<10; i++){
	 if(ten[i]==0)System.out.print("-"); 
	 else 
	 for(int j=0; j<ten[i]; j++) System.out.print("*");
	  System.out.println();
  }
   }
   }
}
 