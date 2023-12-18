import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      
      int a[] = new int[n];
      int b[] = new int[n];
      int c[] = new int[n];
      for(int i=0; i<n; i++){
      	a[i] = sc.nextInt();
        b[i] = 0;
        c[i] = 1;
      }
      
      Arrays.sort(a);
      
      int d = a[n-1];
      b[0] = d;
      int cnt = 0;
      for(int i=n-2; i>= 0; i--){
        if(d == a[i]){
      		b[cnt] = d;
        	c[cnt]++;
        }else{
          d = a[i];
          cnt++;
          b[cnt] = d;
        }
      }
      
      int r=0;
      for(int i = 0; i <= cnt;){
        r += b[i];
        c[i]--;
        
        if(c[i] <= 0){
          i++;
          if(i == cnt && c[i] == 1)
            break;
        }
          
        
      }
      	System.out.println(r);
    }
}
