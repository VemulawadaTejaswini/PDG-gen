import java.util.Scanner;
public class Main{
    
    public static void main (String[] args){
       
       Scanner sc = new Scanner (System.in);
       
       int N = sc.nextInt();
       String S = sc.next();
       int K = sc.nextInt();
       
       char A = S.charAt(K-1);
       
       
       for (int index=0; index<N; index++){
           
           if (A==S.charAt(index)){
               System.out.print(A);
           } else {
               System.out.print("*");
           }
       }
       
       System.out.println();
    }
}