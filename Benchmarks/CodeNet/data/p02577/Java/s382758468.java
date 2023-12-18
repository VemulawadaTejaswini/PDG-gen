
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         String N=gs();
         long r=0;
         for (int i=0; i<N.length();i++) {
        	 int a=Integer.parseInt(N.substring(i,i+1));
        	 r+=a;
         }

         if(r%9==0) {
        	 System.out.println("Yes");
         } else {
        	 System.out.println("No");
         }

         

     }

     public static long f(int n, int s, int e) {
    	 if(s<=e) {
    		 return e-s;
    	 } else {
    		 return n-s+e;
    	 }
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