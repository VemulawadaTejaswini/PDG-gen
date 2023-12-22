import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    int k=0;
    for(int i=0;i<n;i++){
      while((a[i]&1)==0){
        a[i]/=2;
        k++;
      }
    }
    System.out.println(k);
  }
}