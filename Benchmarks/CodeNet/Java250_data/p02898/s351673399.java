import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    Integer h[]  = new Integer[n + 100];
    for (int i = 0; i < n; i++) {
      h[i]  = sc.nextInt();
    }
    int num = 0;
    for(int i = 0; i < n; i++){
      if(h[i] >= k) num ++;
    }
    System.out.println(num);
  }
}
