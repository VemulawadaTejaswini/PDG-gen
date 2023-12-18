import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
        int H[] = new int[N];
        int count = 0;
        int ans = 0;
        for(int i = 0; i < N; i++){
      	  H[i] = sc.nextInt();
          if(i >= 1 && H[i- 1] >= H[i]){
            count += 1;
          }else{
            count = 0;
          }
          if(ans < count){
            ans = count;
          }
        }
      	System.out.println(ans);
    }
}