import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=sc.nextInt();
    int a=sc.nextInt();
    double A=(t-a)*1000/6.0;
    double[] h=new double[n];
    for(int i=0;i<n;i++){
      h[i]=Math.abs(sc.nextInt()-A);
    }
    int idx=0;
    for(int i=1;i<n;i++){
      if(h[i]<h[idx]){
        idx=i;
      }
    }
    System.out.println(idx+1);
  }
}