import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] a= new int[n+1];
    int[] b= new int[n];
    for(int i=0;i<=n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      b[i]=sc.nextInt();
    }
    long df=0;
    for(int i=0;i<n;i++){
      int kl=Math.min(a[i],b[i]);
      df+=kl;
      b[i]=b[i]-kl;
      kl=Math.min(a[i+1],b[i]);
      df+=kl;
      a[i+1]=a[i+1]-kl;
    }
    System.out.println(df);
  }
}