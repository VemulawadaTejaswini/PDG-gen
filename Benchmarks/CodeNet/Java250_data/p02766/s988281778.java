import java.util.*;
public class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int k = sc.nextInt();
   int count = 1;
   while(true){
    if(n/(int)(Math.pow(k,count))==0) break;
    count++;
   }
   System.out.println(""+count);
 }
}