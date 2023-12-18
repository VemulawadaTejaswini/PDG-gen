import java.io.*;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int    x = in.nextInt();
       int    y = in.nextInt();
       int    w;
       
       while(x!=0 || y!=0){
          if(x>y){
             w = x;
             x = y;
             y = w;
          }
        System.out.println(x + " " + y);

        x = in.nextInt();
        y = in.nextInt();
}  

}
}