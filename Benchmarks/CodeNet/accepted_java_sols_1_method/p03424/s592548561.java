
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] map = new int[100];
        for (int i = 0; i < N; i++) {
        	String s = sc.next();
        	map[(int)s.charAt(0)]++;
        }
        
        int ans = 0;
        for (int count: map) {
        	if (count != 0) {
        		ans++;
        	}
        }
        
        
        System.out.println(ans == 3 ? "Three" : "Four");
    }
}


