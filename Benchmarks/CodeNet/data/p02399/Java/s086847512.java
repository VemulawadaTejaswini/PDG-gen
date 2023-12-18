import java.util.*;
class Main{
        public static void main(String [] args){
               Scanner scan = new Scanner(System.in);
               int a;
               int b;
               a = scan.nextInt();
               b = scan.nextInt();
               System.out.println(String.format("%d, %d, %.5f", a/b,a%b,(double)a/b));
        }
}