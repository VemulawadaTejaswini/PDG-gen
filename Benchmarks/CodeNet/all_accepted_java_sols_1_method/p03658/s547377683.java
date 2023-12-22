import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
        PriorityQueue<Integer> sizes = new PriorityQueue(Collections.reverseOrder());
              
        for(int i = 0; i < n; i++) {
          sizes.add(Integer.parseInt(sc.next()));
        }
        
        int ans = 0;
        for(int i = 0; i < k; i++) {
          ans += sizes.poll();
        }
    
		// 出力
		System.out.println(ans);
	}
}