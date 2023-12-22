import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long p = 1;
    long w = 1000000007L;
    for(long i=1; i<=N; i++){
      p = (p*i)%w;
    }
    System.out.println(p);
  }
}
