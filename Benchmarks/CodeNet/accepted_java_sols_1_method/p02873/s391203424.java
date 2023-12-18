import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        char prev = s.charAt(0);
        int streakLen = 1;
        List<Integer> l = new ArrayList<>();
        for(int i=1; i<len; i++) {
            char c = s.charAt(i);
            if(c==prev) {
                streakLen++;
            }
            else {
                l.add(streakLen * (prev == '>' ? -1 : 1));
                streakLen = 1;
                prev = c;
            }
        }
        l.add(streakLen * (prev == '>' ? -1 : 1));

        long sum = 0;
        for(int i=0; i<l.size(); i++) {
            int n = l.get(i);
            if(n>0) {
                sum += (long)n * (long)(n-1) / 2;
                if(i==l.size()-1) {
                    sum += n;
                }
            }
            else {
                n *= -1;
                sum += (long)n * (long)(n+1) / 2;
                if(i>0) {
                    sum += Math.max(n, l.get(i-1)) - n;
                }
            }
        }
        System.out.println(sum);
    }
}
