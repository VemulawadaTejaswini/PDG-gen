import java.util.*;

public class Main {
  
  	public static int diff(String a, String b) {
    	if(a.length() == b.length()) {
        	int count = 0;
          	for(int i = 0; i < a.length() -1; i++) {
            	if( a.substring(i ,i + 1).equals(b.substring(i , i+1)) ) {
                	count++;
                }
            }		
          	return count;
        }
      	return 1000000000;
    }

	public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      int n = sn.nextInt();
      Long a[] = new Long[n];
      for(int i=0; i < n; i++) {
      	a[i] = sn.nextLong();
      }
      Long res = 0L;
      Long m = 1000000007L;
      for(int i = 0; i < n - 1; i++) {
      	for(int j = i + 1; j < n; j++) {
        	res = res % m + ( ( ( (a[i] % m) * (a[j] % m) ) % m ) % m );
        }
      }
      System.out.println(res);
    }
}