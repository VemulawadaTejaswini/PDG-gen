import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	boolean ans = true;
      	int N = Integer.parseInt(sc.next());
      	Map<Integer, Integer> m = new HashMap<>();
      	for (int i = 0; i < N; i++) {
          	int d = Integer.parseInt(sc.next());
        	m.put(d, m.getOrDefault(d, 0) + 1);
        }
      	
      	int M = Integer.parseInt(sc.next());
      	for (int i = 0; i < M; i++) {
        	int t = Integer.parseInt(sc.next());
          	if (m.getOrDefault(t, 0) == 0) {
            	ans = false;
              	break;
            }
          	m.put(t, m.get(t) - 1);
        }
      	System.out.println(ans ? "YES" : "NO");
    }
}