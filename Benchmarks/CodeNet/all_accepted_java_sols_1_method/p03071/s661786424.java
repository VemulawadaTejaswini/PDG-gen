import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int coin = 0;
        if(a>b){
          coin += a;
          if(a-1>b){
              coin += (a-1);
          }else{
              coin += b;
          }
        }else if(b>a){
            coin += b;
            if(b-1>a){
                coin += (b-1);
            }else {
                coin += a;
            }
        }else{
            coin = a + b;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(coin);
        out.flush();
        scan.close();
    }
}