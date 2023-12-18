import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
        int h[] = new int[n];
        int i;
        int count = 0;
        for(i = 0;i < n;i++){
          h[i] = sc.nextInt();
          if(h[i] >= k){
            count += 1;
          }
        }
       System.out.println(count);  
  
    }
}