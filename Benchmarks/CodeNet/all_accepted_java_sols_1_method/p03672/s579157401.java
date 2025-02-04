import java.util.*;

public class Main{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.substring(0, s.length() - 1);
        int n = s.length();
        String[] array = new String[n];
        for (int i = 1; i < n; i++) {
            array[i] = s.substring(0, i);
        }
        int max = 1;
        
        for (int i = 1; i < n / 2 + 1; i++) {
            if (s.substring(i, i * 2).equals(array[i])) {
                max = Math.max(max, i * 2);
            }
        }
        System.out.println(max);
    }
}
