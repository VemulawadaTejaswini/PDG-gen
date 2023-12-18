import java.util.*;

public class Main {
    static long GOSENCHOU = 5000000000000000l;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int[] s = new int[n];
        long k = sc.nextLong();
        int answer = -1;
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            if (s[i] == 1) {
                if (i + 1 == k) {
                    answer = 1;
                    break;
                }
            } else {
                answer = s[i];
                break;
            }
        }
        
        System.out.println(answer);
    }
}