import java.util.*;
class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] HP = new long[N];
    for(int i=0; i < N; i++){
      HP[i]= sc.nextLong();
    }
    Arrays.sort(HP);
    long total = 0;
    int lim = (N<K)? 0 : N-K;
    for(int i = 0; i < lim; i++){
        total += HP[i];
    }
    System.out.print(total);
    
  }
}