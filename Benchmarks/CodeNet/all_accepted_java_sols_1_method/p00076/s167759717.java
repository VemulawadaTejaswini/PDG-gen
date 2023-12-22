import java.util.Scanner;
import static java.lang.Math.*;

import java.io.PrintWriter;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while(true){
            int n = sc.nextInt();
            if(n == -1)return;
            double x = 0, y = 0, rad = 0;
            while(n-->0) {
                x += cos(rad);
                y += sin(rad);
                rad = atan2( y, x) + PI/2;
            }
            System.out.printf("%.2f\n%.2f\n", x, y);
        }
    }
}