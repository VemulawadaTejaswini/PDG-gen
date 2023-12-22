import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum[] = new int[s.length() - 2];
        for (int i = 0; i < s.length() - 2; i++) {
            int l = Character.getNumericValue(s.charAt(i));
            int m = Character.getNumericValue(s.charAt(i + 1));
            int n = Character.getNumericValue(s.charAt(i + 2));
            sum[i] = Math.abs(l * 100 + m * 10 + n - 753);
        }
        Arrays.sort(sum);
        System.out.println(sum[0]);
    }
}