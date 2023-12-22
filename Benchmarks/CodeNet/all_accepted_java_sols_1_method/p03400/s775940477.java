import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        
        int ans = X;
        for (int i = 0; i < N; i++) {
        	int a = sc.nextInt();
        	for (int j = 1; j <= D; j+=a) {
        		ans++;
        	}
        }
        System.out.println(ans);
    }
    
}