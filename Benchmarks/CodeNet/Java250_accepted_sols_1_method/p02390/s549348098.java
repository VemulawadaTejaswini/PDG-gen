import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int h = s / 3600;
       s -= 3600*h;
       int m = s / 60;
       s -= 60*m;
       System.out.printf("%d:%d:%d\n",h,m,s);
    }
}