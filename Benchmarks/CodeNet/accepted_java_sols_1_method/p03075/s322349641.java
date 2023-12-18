import java.util.*;
import java.io.*;

public class Main{
 public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   int[] arr = new int[5];
   for(int i=0; i<5; i++){
   arr[i] = s.nextInt();
   }
   
   int maxd = s.nextInt();
   String status ="Yay!";
   
   outerloop:
   for(int j=0; j<4; j++){
   for(int l=j+1; l<5; l++){
   if(arr[l]-arr[j] > maxd){
   status =":(";
     break outerloop;
   }
   }
   }
   System.out.print(status);
 }
}