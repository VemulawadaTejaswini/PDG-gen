import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=sc.nextInt();
    int c=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      int cc=sc.nextInt();
      if(sc.nextInt()<=t){
        c=Math.min(c,cc);
      }
    }
    System.out.println(c==Integer.MAX_VALUE?"TLE":c);
  }
}