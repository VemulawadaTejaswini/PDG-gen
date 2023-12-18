import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    int[] n=new int[N];
    for(int i=0;i<N;i++){
      n[i]=sc.nextInt();
    }
    Arrays.sort(n);
    n[N-1]/=2;
    int sum=0;
    for(int i:n){
      sum+=i;
    }
    System.out.println(sum);
  }
}