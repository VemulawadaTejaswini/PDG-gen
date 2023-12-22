import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
        int[] list = new int[3];
        for(int i = 0; i < 3; i++) {
          list[i] = sc.nextInt();
        }
        Arrays.sort(list);
      
        int k = sc.nextInt();
      
        for(int i = 0; i < k; i++) {
          list[2] *= 2;
        }
        int ans = 0;
        for(int i = 0; i < list.length; i++) {
          ans += list[i];
        }
    
		// 出力
		System.out.println(ans);
	}
}