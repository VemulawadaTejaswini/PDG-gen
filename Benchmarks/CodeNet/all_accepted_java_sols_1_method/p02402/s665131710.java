import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();

       long sum_ = 0, max_ = -10000000, min_ = 10000000;
       for(int i=0;i<n;i++) {
	       int d = in.nextInt();
	       sum_ += d;
	       min_ = Math.min(min_, d);
	       max_ = Math.max(max_, d);
       }
       if(n == 0) System.out.println("0 0 0\n");
       else System.out.printf("%d %d %d\n", min_, max_, sum_);
    }
}