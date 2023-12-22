import java.util.*;
import java.math.*;

class Main{       
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);  
      
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      
      if(D <= A || B<=C){
          System.out.println(0);
          return;
      }else if(C <= A && D <= B){
          System.out.println(D-A);
          return;
      }else if(C<=A &&  B<=D){
          System.out.println(B-A);
          return;
      }else if(A<=C && D<=B){
          System.out.println(D-C);
          return;
      }else if(A<=C && B<=D){
          System.out.println(B-C);
          return;
      }      
      
      
   }
}