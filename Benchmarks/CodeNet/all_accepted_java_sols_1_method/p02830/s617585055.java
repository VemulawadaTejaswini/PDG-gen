import java.util.*;

class Main{
 public static void main(String args[]){
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt(); 
   String s = scn.next();
   String t = scn.next();
   String st = "";
   for(int i = 0; i<n; i++){
     st += s.substring(i,i+1);
     st += t.substring(i,i+1);
   }
   System.out.println(st);
 }
}