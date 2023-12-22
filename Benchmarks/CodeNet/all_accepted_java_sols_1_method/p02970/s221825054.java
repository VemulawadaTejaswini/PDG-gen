import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args){
    Scanner  sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int a = 0;
    int i = 0;
    while(a < n){
      a += 2 * d + 1;
      i ++;
          }
          System.out.println(i);
  }
}
