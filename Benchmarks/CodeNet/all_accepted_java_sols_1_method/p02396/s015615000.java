import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int d;
       int idx = 0;
       while((d = in.nextInt()) != 0) {
	       System.out.printf("Case %d: %d\n", ++idx, d);
       }
    }
}