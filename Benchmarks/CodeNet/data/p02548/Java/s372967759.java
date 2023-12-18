import java.util.*;
public class Main {
  	public static int muld(int n){
      int cnt = 0;
      for(int i = 1;i <= n/i;i++){
        if(n % i == 0){
          if(i == n/i) cnt++;
          else cnt += 2;
        }
      }
      
      return cnt;
    }
  
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      	int cnt = 1;
		
      	for(int i = 1;i < n-1;i++){
          cnt += muld(n - i);
        }
      	
		System.out.println(cnt);
	}
}