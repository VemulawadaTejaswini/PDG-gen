import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int S = sc.nextInt();
      int h = 0;
      int m = 0;
      int s = 0;
     
       if( S <= 86400 ){
           s = S % 60;
           h = ((S - s) / 60) / 60;
           m = ((S - s) / 60) % 60;
       }
       
       System.out.printf("%d:%d:%d\n", h, m, s);
       System.out.println();
   }
}
