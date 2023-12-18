import java.lang.Math;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      long a,b;
      a=in.nextInt();
      b=in.nextInt();
      System.out.println(ceil(log10((double)a+b)));
    }
}