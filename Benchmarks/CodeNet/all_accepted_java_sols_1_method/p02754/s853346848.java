import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long n,a,b,sum=0;
    n=sc.nextLong();
    a=sc.nextLong();
    b=sc.nextLong();
    
    sum=(n/(a+b))*a+((n%(a+b))>a?a:(n%(a+b)));
    System.out.print(sum);
  }
}