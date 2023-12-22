import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int[] b=new int[n];
    b[0]=a[0];
    for(int i=1;i<n;i+=2){
      b[0]=b[0]-a[i]+a[i+1];
    }
    for(int i=1;i<n;i++){
      b[i]=a[i-1]*2-b[i-1];
    }
    for(int i=0;i<n;i++){
      System.out.print(b[i]+" ");
    }
    System.out.println();
  }
}