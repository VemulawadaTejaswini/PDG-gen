import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] x=new int[n];
    int[] y=new int[n];
    for(int i=0;i<n;i++){
      y[i]=x[i]=sc.nextInt();
    }
    Arrays.sort(y);
    int l=y[n/2-1];
    int r=y[n/2];
    for(int i=0;i<n;i++){
      if(x[i]<=l){
        System.out.println(r);
      }else{
        System.out.println(l);
      }
    }
  }
}