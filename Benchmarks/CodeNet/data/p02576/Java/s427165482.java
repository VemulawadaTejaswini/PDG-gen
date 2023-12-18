
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int X=gi();
         int T=gi();
         long[] A=new long[N];

         int a=Math.floorDiv(N, X);
         if(N%X!=0)a++;
         long ans=a*T;


         System.out.println(ans);

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