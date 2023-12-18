
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] L=new int[N];


         long ans=0;
         for  (int i=0; i<N; i++) {
        	 L[i]=gi();
         }
         
         for  (int i=0; i<N; i++) {
        	 for  (int j=i+1; j<N; j++) {
        		 for  (int k=j+1; k<N; k++) {
                	 if(L[i]!=L[j] && L[j]!=L[k] && L[k]!=L[i]) {
                		 if(Math.max(L[i], Math.max(L[j], L[k]))==L[i] && L[i]<L[j]+L[k]) {
                			 ans++;
                		 } else if(Math.max(L[i], Math.max(L[j], L[k]))==L[j] && L[j]<L[i]+L[k]) {
                			 ans++;
                		 } else if(Math.max(L[i], Math.max(L[j], L[k]))==L[k] && L[k]<L[j]+L[i]) {
                			 ans++;
                		 }
                		 
                	 }
                 }
             }
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