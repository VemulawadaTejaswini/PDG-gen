import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int p[] = new int[n];
        int i = 0;
        int count = 0;
		// 出力
      for(i = 0; i < n; i++){
        p[i] = sc.nextInt();
      }
	  for(i = 1; i < n-1; i++){
        if(p[i-1] < p[i] && p[i + 1] > p[i]){
          count += 1;
        }else if(p[i-1] > p[i] && p[i + 1] < p[i]){
          count += 1;
        }
      }
      System.out.println(count);
	}
}