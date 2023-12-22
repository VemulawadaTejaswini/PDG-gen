import java.util.*;

public class Main{
    public static void main(String args[]){

      Scanner scn = new Scanner(System.in);
      int A = scn.nextInt();
      int B = scn.nextInt();
      int C = scn.nextInt();
      int D = scn.nextInt();
      
      while(A>0 || C>0){
      C=C-B;
         if(C<=0){
        System.out.println("Yes");
          break;
        }
      A=A-D;
         if(A<=0){
        System.out.println("No");
          break;
        }
      }
         }
}