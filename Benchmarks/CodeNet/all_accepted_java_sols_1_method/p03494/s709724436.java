import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int rand[] = new int[x];
    for (int i = 0;i<x ;i++ ) {
      rand[i] = sc.nextInt();
    }
    sc.close();
    int count = -1;
    int half[] = new int[x];
    half = rand;
    boolean flg = true;
    while(flg){
      for (int i = 0;i<x;i++) {
        if (half[i]%2 ==1) {
          flg = false;
        }
        half[i] = half[i]/2;
      }
      count = count + 1;
    }
    System.out.println(count);
  }
}