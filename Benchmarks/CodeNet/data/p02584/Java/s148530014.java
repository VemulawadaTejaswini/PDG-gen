

import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         long X=gl();
         long K=gl();
         long D=gl();

         long px=Math.abs(X);
         long a=Math.min(Math.floorDiv(px, D),K);
         K=K-a;

         long ans=0;
         if (K%2==0) {
        	 ans=px-a*D;
         } else {
        	 ans=px-a*D;
        	 ans=Math.abs(ans-D);
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