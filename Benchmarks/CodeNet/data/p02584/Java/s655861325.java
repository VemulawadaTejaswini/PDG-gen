import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long X=sc.nextLong();
    long K=sc.nextLong();
    long D=sc.nextLong();
    long div=(long)Math.ceil
    ((double)X/(double)D);
    long ndiv=Math.min(div,K);
    long num=X-D*ndiv;
    K-=ndiv;
    long ans=0;
    if(K%2==0)
    {
      ans=Math.abs(num);
    }
    else
    {
      ans=Math.abs(num+D);
    }
    System.out.println(ans);
  }
}