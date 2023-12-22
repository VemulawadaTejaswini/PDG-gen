import java.util.*;

public class Main {
    public static List<int[]> list = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        int length = 0;
        for (int i = 0; i < N; i++) {
            String S = s.substring(i, N);
            String T = t.substring(0, N-i);
            if (S.equals(T)) {
                length = S.length();
                break;
            }
        }
        System.out.println(N*2-length);
    }
}