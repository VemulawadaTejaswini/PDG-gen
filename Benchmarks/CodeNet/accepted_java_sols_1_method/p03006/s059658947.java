import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        HashMap<String, Integer> s = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int x1 = (x[i] - x[j]);
                    int y1 = (y[i] - y[j]);
                    String input = String.valueOf(x1) + "-" + String.valueOf(y1);
                    if (s.containsKey(input)) {
                        s.put(input, s.get(input) + 1);
                    } else {
                        s.put(input, 1);
                    }
                }
            }
        }
        int max = 0;
        for (Integer val : s.values()) {
            if (max < val) {
                max = val;
            }
        }

        System.out.println(n - max);
    }
}