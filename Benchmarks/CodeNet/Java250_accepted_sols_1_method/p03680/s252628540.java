import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer a[]  = new Integer[n + 100];
    for (int i = 1; i <= n; i++) {
      a[i]  = sc.nextInt();
    }
    int index = 1;
    int num = 0;
    while(true){
      num++;

      if(a[index] == 2){
        System.out.println(num);
        return;
      }
     
      if(num > n){
        System.out.println(-1);
        return;
      }
      index = a[index];
    }

  }
}
