import java.util.*;
import java.io.*;
class solution{
 public static void main(String[] args){
 
	Scanner scan = new Scanner(System.in);
   int value = Integer.parseInt(scan.nextLine());
   int cur = 1000;
   while(cur<=value){
   	cur += cur;
   
   }
   System.out.println(value-cur);
 
   
 } 
  
  
}