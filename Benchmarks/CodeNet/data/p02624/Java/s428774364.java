import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    long ans=0;
    for(int i=1;i<=N;i++)ans+=(  ( (N/i) *i+i ) * (N/i)  )/2;
    System.out.println(ans);

  }  
}