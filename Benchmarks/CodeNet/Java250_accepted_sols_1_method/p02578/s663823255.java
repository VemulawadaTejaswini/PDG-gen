import java.util.*;
 
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int [n];
    long ans=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if(i!=0){
      if(a[i]<a[i-1]){
        ans+=(long)a[i-1]-a[i];
        a[i]=a[i-1];
      }
    }
    }
    System.out.println(ans);
  }
}