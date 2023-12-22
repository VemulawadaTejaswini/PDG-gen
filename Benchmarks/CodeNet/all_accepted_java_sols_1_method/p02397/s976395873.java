import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int a, b;
       int idx = 0;
       while(true) {
	       a = in.nextInt();
	       b = in.nextInt();
	       if(a == 0 && a == b) return;
	       if(a<b) System.out.printf("%d %d\n", a, b);
	       else System.out.printf("%d %d\n", b, a);
       }
    }
}