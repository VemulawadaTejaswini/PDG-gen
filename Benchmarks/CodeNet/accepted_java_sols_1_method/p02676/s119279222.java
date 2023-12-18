import java.util.Scanner;
   public class Main {
   public static void main(String[] args) {
     
        //sec--1
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();
        //String S = sc.nextLine();
        
        //sec--2
        if(S.length() <= K) {
          System.out.println(S);
        } else if (S.length() > K) {
          //System.out.println(S[K] + "...");
          System.out.println(S.substring(0,K) + "...");
        }
   }
}