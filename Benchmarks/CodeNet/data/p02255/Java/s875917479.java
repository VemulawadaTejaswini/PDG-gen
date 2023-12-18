import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String args[]){
    Scanner stdIn=new Scanner(System.in);
    int x=stdIn.nextInt();
    long[] a=new long[x];
    //input
    for(int i=0;i<x;i++){
        a[i]=stdIn.nextLong();
    }
    //print
    for(int i=0;i<x;i++){
      System.out.print(a[i]);
      if(i!=x-1) System.out.print(" ");
    }
    System.out.println();
    //sort
    long v;
    for(int i=1;i<x;i++){
      v=a[i];
      int j=i-1;
      while(j>=0&&a[j]>v){
        a[j+1]=a[j];
        a[j]=v;
        j--;
      }
      for(int k=0;k<x;k++){
        System.out.print(a[k]);
        if(k!=x-1) System.out.print(" ");
      }
      System.out.println();
    }
  }
}

