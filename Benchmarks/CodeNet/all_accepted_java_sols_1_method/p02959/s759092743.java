import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

      int[] a = new int[n+1];
      for(int i = 0; i < n+1 ; i++) {
        a[i] = sc.nextInt();
      }

      int[] b = new int[n];
      for(int i = 0; i < n ; i++) {
        b[i] = sc.nextInt();
      }

      
      long cnt = 0;
      for(int i = 0; i < n; i++) {
        if(a[i] > b[i]) {
          
          cnt+=b[i];
          a[i] = a[i] - b[i];
          b[i] = b[i] - b[i];


        } else {
          if(a[i] != 0) {
            cnt+=a[i];
            b[i] -= a[i];
            a[i] -= a[i];
          }
        }
        
    
        if(b[i] != 0) {
          if(a[i+1] > b[i]) {
            cnt+=b[i];
            a[i+1] -= b[i];
            b[i] -= b[i];
          } else {
            if(a[i+1]!=0) {
              cnt+=a[i+1];
              b[i] -= a[i+1];
              a[i+1] -= a[i+1];
            }
          }
        }

       
      }

      System.out.println(cnt);
    }
}