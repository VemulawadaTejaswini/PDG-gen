import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Q = sc.nextInt();
    String S = sc.next();
    int count = 0;
    int[] Time = new int[N+1];
    int r;
    int l;
    Time[0] = 0;
    for(int i=1; i<=N; i++){
      if(i!=N && S.charAt(i-1)=='A' && S.charAt(i)=='C'){
        count++;
      }
      Time[i] = count;
    }
    
    for(int i=0; i<Q; i++){
      r = sc.nextInt();
      l = sc.nextInt();
      System.out.println(Time[l-1] - Time[r-1]);
    }
  }
}
