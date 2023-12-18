//パケット法
import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] a = new int[n];
    int[] aa = new int[n+1];
    int kind = 0;
    int sum = 0;

    for(int i = 0; i < n; i++){a[i] = scan.nextInt();}
    for(int i = 0; i < n; i++){aa[i] = 0;}
    for(int i = 0; i < n; i++){aa[a[i]]++;}
    for(int i = 1; i < n+1; i++){
      if(aa[i] > 0)
        kind++;
    }
    if(kind > k){
      Arrays.sort(aa);
      for(int i = 1; i <= aa.length-1-k; i++){sum += aa[i];}
    }
    System.out.println(sum);
  }
}
