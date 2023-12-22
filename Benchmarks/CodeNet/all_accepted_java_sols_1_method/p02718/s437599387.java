import java.util.Scanner;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt(); 
    int y = scanner.nextInt();
    int a[] = new int[x];
    int sum = 0;
    int i = 0;
    while(i<x){
      a[i] = scanner.nextInt();
      sum += a[i];
      i++;
    }
    Arrays.sort(a);
    double aa = (double)a[x-y] / (double)sum;
    double bb = (double)1/ (double)(4*y);
    //System.out.println(a[x-y]);
    //System.out.println(aa);
    //System.out.println(bb);
    if(aa >= bb){
      System.out.print("Yes");
    }
    else{
      System.out.print("No");  
    }
  }
}