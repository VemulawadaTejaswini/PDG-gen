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
      	int aPos = 0;
      	int bPos = 0;
      	while(true){
          if((aPos < n)&&(bPos < m)&&(a[aPos] <= b[bPos])){
            tmp += a[aPos];
            aPos++;
          }else if( bPos < m ){
            tmp += b[bPos];
            bPos++;
          }else{
            break;
          }
          ans++;
          if( tmp > k ){
            ans--;
            break;
          }
        }
      	System.out.println(ans);
	}
}