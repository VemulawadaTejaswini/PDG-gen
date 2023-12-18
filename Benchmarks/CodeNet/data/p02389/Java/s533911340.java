import java.io.*;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int    a = in.nextInt();
       int    b = in.nextInt();
       int    x = a*b;
       int    y = 2*a+2*b;
       System.out.println(x + y);
   }
}