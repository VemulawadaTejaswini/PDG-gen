import java.io.*;
import java.util.*;

public class Main{
  Scanner sc = new Scanner(System.in);
  void run(){
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] count = new int[n+1];
    for(int i = 0; i<n ;i++){
      a[i] = sc.nextInt();
      count[a[i]]++;
    }
    int max = Arrays.stream(count).max().get();
    if(max >= n/2){
      System.out.println("No");
    }
    System.out.println("Yes");
    int off = n/2;
    for(int i = 0; i< n;i++){
      if(i != 0){
        System.out.print(" ");
      }
      System.out.print(a[(i+off)%n]);
    }
    System.out.println();
  }
  public static void main(String[] args){
    Maim m = new Main();
    m.run();
  }
}