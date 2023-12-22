import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int a, b, c;
       a = in.nextInt();
       b = in.nextInt();
       c = in.nextInt();
       int ans = 0;
       for(int i = a; i <= b; i++) {
	       if(c % i == 0) ans++;
       }
       System.out.println(ans);
    }
}