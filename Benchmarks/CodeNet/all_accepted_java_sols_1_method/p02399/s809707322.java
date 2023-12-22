import java.util.*;

class Main {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
          int b = scan.nextInt();
          
          int c = a/b;
          int d = a%b;
          
          String s = String.format("%.5f", 1.0*a/b);

          System.out.println(c + " " + d + " " + s);
     }
}