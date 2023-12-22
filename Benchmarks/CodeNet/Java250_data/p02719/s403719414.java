import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();//初期値
    long k=sc.nextLong();
    long count=0;
    long m=n;

    if (n>=k) {
      count=n/k;
    }


    long ans1=Math.abs(n-(k*count));
    long ans2=Math.abs(n-(k*(count+1)));

    long min=Math.min(ans1,ans2);

    System.out.println(min);
  }
}
