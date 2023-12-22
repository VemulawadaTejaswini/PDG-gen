import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        
        int[] map = new int[M];
        for (int i = 0; i < M; i++) {
        	map[i] = sc.nextInt();
        }
        
        int max = 0;
        for (int i = X; i < N; i++) {
        	for (int cost : map) {
        		if (i == cost) {
        			max++;
        		}
        	}
        }
        
        int min = 0;
        for (int i = X; 0 < i; i--) {
        	for (int cost : map) {
        		if (i == cost) {
        			min++;
        		}
        	}
        }
        
        System.out.println(Math.min(max, min));
    }
}