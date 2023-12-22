import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int count=0;
    int n=sc.nextInt();
    int[] a;
    a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
      for(int j=n-1;j>i;j--){
        if(a[j]<a[j-1]){
          int c=a[j];
          a[j]=a[j-1];
          a[j-1]=c;
          count++;
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(a[i]);
      if(i!=n-1) System.out.print(" ");
      else System.out.println();
    }
    System.out.println(count);
  }
}

