import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int x=sc.nextInt();
    int f=Math.max(x+1-k,-1000000);
    int t=Math.min(x-1+k,1000000);
    for(int i=f;i<=t;i++){
      System.out.println(i);
    }
  }
}