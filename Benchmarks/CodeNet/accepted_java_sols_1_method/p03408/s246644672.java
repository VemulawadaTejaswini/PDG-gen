import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> freq = new HashMap<>();
        for(int i = 0; i < n; i++) {
        	String s = sc.next();
        	freq.put(s, freq.getOrDefault(s, 0) + 1);
        }
		int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
        	String s = sc.next();
        	freq.put(s, freq.getOrDefault(s, 0) - 1);
        }
        int max = 0;
        for(int v : freq.values())
        	max = Math.max(v, max);
        System.out.println(max);
    }
}
