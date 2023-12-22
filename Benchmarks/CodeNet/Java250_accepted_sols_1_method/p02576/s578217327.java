import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int t=sc.nextInt();
    int u=0,t1=0;
    while(u<n){
      t1=t1+t;
      u=u+x;
    }
    System.out.println(t1);
  }}