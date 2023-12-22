import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int k = sc.nextInt();
      int score;
      
   if (k <= a) {
     score = k;
   } else if ( k >a && k <= a+b) {
     score = a;
   } else {
     score = a-(k-a-b) ;
   }
      
   System.out.println(score);
  }
}
      