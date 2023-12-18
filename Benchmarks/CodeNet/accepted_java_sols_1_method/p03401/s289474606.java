import java.util.Scanner;
import java.lang.Math;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int [n + 2];
    a[0] = 0;
    for(int i = 1;i < n + 1;i++){
      a[i] = sc.nextInt();
    }
    a[n + 1] = 0;
    int sum = 0;
    int nsum[] = new int [n];

    for(int i = 1;i <= n + 1;i++){
      sum += Math.abs(a[i-1] - a[i]);
    }

    for(int i = 1;i < n + 1;i++){
      nsum[i-1] = sum + Math.abs(a[i-1] - a[i+1]) - (Math.abs(a[i-1] - a[i]) + Math.abs(a[i] - a[i+1]));
      System.out.println(nsum[i-1]);
    }
  }
}