import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] map = new int[N+1];
        for (int i = 0; i < N; i++) {
        	map[i] = sc.nextInt();
        }
        
        map[N] = 0;
        
        int ans = 0;
        int now = map[0];
        for (int i = 1; i < N+1; i++) {
        	if (now > map[i]) {
        		ans += now - map[i];
        	}
        	now = map[i];
        }
        
        System.out.println(ans);
    }
}