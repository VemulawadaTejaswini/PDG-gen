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

    int swap=0;
    int index=x-1;
    long temp;
    for(int i=0;i<index;i++){
      int j=1;
      while(index-j>=i){
        if(a[index-j+1]<a[index-j]){
          temp=a[index-j+1];
          a[index-j+1]=a[index-j];
          a[index-j]=temp;
          swap++;
        }
        j++;
      }
    }
    for(int i=0;i<x;i++){
      System.out.print(a[i]);
      if(i!=x-1)
        System.out.print(" ");
    }
    System.out.println();
    System.out.println(swap);
  }
}

