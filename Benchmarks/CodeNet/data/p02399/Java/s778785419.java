import java.util.Scanner;
class Main{
        public static void main(String [] args){
               Scanner scan = new Scanner(System.in);
               int a;
               int b;
               int d;
               int r;
               double f;
               a = scan.nextInt();
               b = scan.nextInt();
               d = a/b;
               r = a%b;
               f = (double)a/b;
               System.out.println(String.format("%d, %d, %.5f\n", d,r,f));
          }
}