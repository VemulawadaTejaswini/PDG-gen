import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	long k = sc.nextLong();
      	long[] a = new long[n];
      	long[] b = new long[m];
      	boolean bFlag = true;
      	long ans = 0;
      	long tmp = 0;
      	for(int i=0;i<n;i++){
          a[i] = sc.nextLong();
        }
      	for(int i=0;i<m;i++){
          b[i] = sc.nextLong();
        }
      	for(int i=0;(i<n)||(i<m);i++){
          if( i < n ){
            tmp += a[i];
            ans++;
          }
          if( tmp > k ){
            ans--;
            break;
          }
          if( i < m ){
            tmp += b[i];
            ans++;
          }
          if( tmp > k ){
            ans--;
            break;
          }
        }
      	System.out.println(ans);
	}
}