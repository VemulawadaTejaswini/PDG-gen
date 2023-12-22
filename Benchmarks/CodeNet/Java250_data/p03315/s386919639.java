import java.util.Scanner;

class Main {
   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       int x = 0;
       String S = scanner.next();

       for (int i = 0; i < 4; i++) {
           String str = S.substring(i,i+1);
           //System.out.println(str);
           if (str.equals("+")) {
        	   x = x + 1;
           } else if (str.equals("-")) {
        	   x = x - 1;
           }
           //System.out.println(x);
       }

       System.out.println(x);
   }
}