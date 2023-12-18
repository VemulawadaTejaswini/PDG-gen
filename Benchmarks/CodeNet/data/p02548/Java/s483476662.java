import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long ans=0;
    double x=Math.sqrt(n);
    for(double i=1.0;i<x;i+=1.0){
      ans++;
      int ab=(int)(i*(i+1.0));
      for(;ab<n;ab+=i){
        ans+=2;
      }
    }
    System.out.println(ans);
  }
}