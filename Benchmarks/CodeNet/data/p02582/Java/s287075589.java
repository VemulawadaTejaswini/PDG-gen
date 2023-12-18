
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String S=gs();


         long ans=0;
         if(S.contains("RRR")) {
        	 ans=3;
         } else if(S.contains("RR")) {
        	 ans=2;
         } else if(S.contains("R")) {
        	 ans=1;
         }

         System.out.println(ans);
     }

     // 文字列として入力を取得
     public static String gs() {
          return scanner.next();
     }

     // intとして入力を取得
     public static int gi() {
          return Integer.parseInt(scanner.next());
     }

     // longとして入力を取得
     public static long gl() {
          return Long.parseLong(scanner.next());
     }

     // doubleとして入力を取得
     public static double gd() {
          return Double.parseDouble(scanner.next());
     }
}