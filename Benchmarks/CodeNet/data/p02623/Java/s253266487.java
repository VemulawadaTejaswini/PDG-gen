import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	long k = sc.nextLong();
      	long[] a = new long[n];
      	long[] b = new long[m];
      	for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
      	for(int i=0;i<m;i++){
          b[i] = sc.nextInt();
        }
      	long ans = 0;
      	long max = 0;
      	long tmp = 0;
      	for(int i=0;i<n;i++){
          max = 0;
          tmp = 0;
          for(int j=0;j<i;j++){
            tmp += a[j];
            max++;
            if( tmp > k ){
              i = n;
              max = 0;
              break;
            }
          }
          for(int j=0;j<m;j++){
            tmp += b[j];
            max++;
            if( tmp > k ){
              max--;
              if( max > ans ){
                ans = max;
              }
              break;
            }
          }
        }
      System.out.println(ans);
    }
}