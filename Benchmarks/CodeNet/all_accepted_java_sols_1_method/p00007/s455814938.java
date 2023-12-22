import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       double money = 100000;
       for(int i=0;i<n;i++) {
           money = money + money * 0.05;
           money = Math.ceil(money/1000.0) * 1000;
       }
       System.out.printf("%.0f\n", money);
    }
}