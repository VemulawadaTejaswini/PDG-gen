import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n];
    long ans = 1;
    long MOD = 1000000007;
    boolean allminus = true;
    for(int i=0;i<n;i++){
      a[i] = sc.nextLong();
      if( a[i] > -1 ){
        allminus = false;
      }
    }
    Arrays.sort(a);
    
    int head = 0;
    int tail = n-1;
    int count = 0;
    while(true){
      if( count + 2 > k ){
        break;
      }
      if( a[tail] * a[tail-1] > a[head] * a[head+1] ){
        //a[tail] %= MOD;
        //a[tail-1] %= MOD;
        //System.out.println(a[tail]+"A"+a[tail+1]);
        //ans *= a[tail] * a[tail-1] % MOD;
        ans = ( ans * ( ( a[tail]*a[tail-1] ) % MOD ) ) % MOD;
        tail -= 2;
      }else{
        //a[head] %= MOD;
        //a[head+1] %= MOD;
        //System.out.println(a[head]+"B"+a[head+1]);
        
        //ans *= a[head] * a[head+1] % MOD;
        ans = ( ans * ( ( a[head]*a[head+1] ) % MOD ) ) % MOD;
        head += 2;
      }
      count += 2;      
    }
    if( count + 1 == k ){
      //ans *= a[tail] % MOD;
      ans = ( ans * a[tail] ) % MOD;
      //System.out.println(a[tail]+"D");
    }
    
    if( allminus ){
      ans = 1;
      for(int i=1;i<k+1;i++){
        //ans *= a[n-i]%MOD;
        ans = ( ans * a[n-i] ) % MOD;
        
        //System.out.println(a[n-i]+"C");
        
      }
    }
    if( ans < 0 ){
      ans += MOD;
    }
    System.out.println(ans);
    
    
    
  }
}