import java.util.*;
import java.io.*;

class Main {
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  while(in.hasNext()){
   int num = in.nextInt();
   boolean first = true;
   int beki = 1;
   while(num != 0){
    if(num % 2 == 1){
     if(!first){ System.out.print(" "); }
     System.out.print(beki);
     first = false;
    }
    num = num / 2;
    beki = beki * 2;
   }
   System.out.println();
  }
 }
 
}