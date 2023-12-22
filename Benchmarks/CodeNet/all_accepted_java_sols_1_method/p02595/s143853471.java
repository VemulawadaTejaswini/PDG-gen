import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    long D = d*1l*d;
    int count = 0;
    for(int i = 0; i<n; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        long z = x*1l*x + y*1l*y;
        if(z<=D) count++;
    }
    System.out.println(count);
  }
}