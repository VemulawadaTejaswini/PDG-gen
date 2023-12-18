import java.util.*;
class Main{
        public static void main(String [] args){
               Scanner scan = new Scanner(System.in);
               float a;
               float b;
               int d;
               int r;
               float f;
               a = scan.nextFloat();
               b = scan.nextFloat();
               d = (int)a/(int)b;
               r = (int)a%(int)b;
               f = a/b;
               System.out.println(String.format("%d, %d, %.5f", d,r,f));
          }
}