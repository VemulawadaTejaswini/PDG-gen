import java.util.*;
public class Main {
  	public static int muld(int n,int m){
      int cnt = 0;
      for(int i = 1;i <= n/i;i++){
        if(n % i == 0){
          if(i == n/i) cnt++;
          else cnt += 2;
        }
      }
      if(n == m) return cnt;
      else return muld(n-1,m)+cnt;
    }
  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      	int cnt;
   
      	if(n <= 630000) cnt = muld(n-1,1);
      	else cnt = 8509899 + muld(n-1,630000);
      
		System.out.println(cnt);
	}
}