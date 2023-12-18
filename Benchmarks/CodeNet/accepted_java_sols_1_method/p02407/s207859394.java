import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a;
    a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=n;i>0;i--){
      System.out.print(a[i-1]);
      if(i!=1) System.out.print(" ");
      else System.out.println();
    }
  }
}

