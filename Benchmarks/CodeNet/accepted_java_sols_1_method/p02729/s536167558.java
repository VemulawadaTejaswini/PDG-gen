import java.util.*;
import java.lang.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[]=new int[100];
    a[0]=0;
    a[1]=0;
    a[2]=3;
   
    int l=3;
    for(int i=3;i<100;i++){
      a[i]=a[i-1]+l;
      l=l+1;
    }
    if(n==1&&m==1){
      System.out.println("0");
    }
    else if(n==2&&m==1||n==1&&m==2){
      System.out.println("1");
    }
    else{
      int p=0,q=0;
      if(n>2){
        p=a[n-1];
    }
      if(m>2){
        q=a[m-1];
      }
      int k=0;
      k=p+q;
      System.out.println(k);
  }
    
}}
