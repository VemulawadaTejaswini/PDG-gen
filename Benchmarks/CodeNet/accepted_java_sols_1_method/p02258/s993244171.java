import java.util.Scanner;
import java.lang.Math;
class Main{

  public static void main(String args[]){

    Scanner stdIn=new Scanner(System.in);
    int x=stdIn.nextInt();
    long[] a=new long[x];
    for(int i=0;i<x;i++){
        a[i]=stdIn.nextLong();
    }
    long minv=a[0];
    long maxv=-999999999;

    for(int i=1; i<x; i++){
        maxv=Math.max(maxv,a[i]-minv);
        minv=Math.min(minv,a[i]);
    }

    System.out.println(maxv);
  }
}

