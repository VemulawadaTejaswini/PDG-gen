import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int midx=0;
    int sidx=1;
    if(a[midx]<a[sidx]){
      midx=1;
      sidx=0;
    }
    for(int i=2;i<n;i++){
      if(a[i]>a[midx]){
        sidx=midx;
        midx=i;
      }else if(a[i]>a[sidx]){
        sidx=i;
      }
    }
    for(int i=0;i<n;i++){
      if(i==midx){
        System.out.println(a[sidx]);
      }else{
        System.out.println(a[midx]);
      }
    }
  }
}
