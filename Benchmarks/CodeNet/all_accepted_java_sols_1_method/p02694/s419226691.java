import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     long  x = sc.nextLong();
     int i=0;
     long money=100;
     while(money<x){
       i++;
       money += money/100;
     }
     System.out.println(i);
   }
}
