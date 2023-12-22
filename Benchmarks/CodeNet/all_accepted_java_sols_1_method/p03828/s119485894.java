import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int prime[] = new int[1050];
    for(int i=2;i<=N;i++){
    int x = i;
      for (int j=2;j<=x;j++){
        while(x%j == 0){
          x /= j;
          prime[j] += 1;
        }
      }
    }
    //System.out.println(Arrays.toString(prime));
      int mod = 1_000_000_007;
      long ans = 1;
      for(int i:prime){
        //System.out.println(i);
        ans = ((ans%mod)*(i+1)%mod);
      }
      System.out.println(ans);
        
  }
}
