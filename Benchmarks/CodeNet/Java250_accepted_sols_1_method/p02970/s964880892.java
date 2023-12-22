import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int d = sc.nextInt();

        int cnt = 0;
        int sum = 0;
        while(true) {
          cnt++;
          
          sum += d + 1 + d;
          
          if(sum >= n) {
            break;
          }
        }
      
      
      	System.out.println(cnt);
    
    }
}