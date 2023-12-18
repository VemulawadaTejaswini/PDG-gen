import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n];
    long ans = 1;
    int minpos = 0;
    int maxpos = n-1;
    boolean minus = false;
    boolean allminus = true;
    for(int i=0;i<n;i++){
      a[i] = sc.nextLong();
      if( a[i] > -1 ){
        allminus = false;
      }
    }
    Arrays.sort(a);
    
    //あと２つ以上掛け算するなら
    //次の２つはどっちが大きい？
    
    long maxtmp;
    long mintmp;
    int maxp = n-1;
    int minp = 0;
    int count = 0;
    while(true){
    	maxtmp = 1 * a[maxp] * a[maxp-1] % (long)( 1000000000 + 7 );
        mintmp = 1 * a[minp] * a[minp+1] % (long)( 1000000000 + 7 );
      	if( count + 2 > k ){
        	break;
        }
        if( maxtmp > mintmp ){
        	ans = ans * maxtmp % (long)( 1000000000 + 7 );
            maxp -= 2;
            count += 2;
        }else{
        	ans = ans * mintmp % (long)( 1000000000 + 7 );
            minp += 2;
            count += 2;
        }
    }
    if( count == k-1 ){
    	ans = ans * a[maxp] % (long)( 1000000000 + 7 );
    }
    
    
    
    if(allminus&&k%2==1){
      ans = 1;
      for(int i=0;i<k;i++){
        ans = (ans *  a[n-1-i] + (long)1000000007)% (long)( 1000000000 + 7 );
      }
    }
    System.out.println(ans);
  }
}