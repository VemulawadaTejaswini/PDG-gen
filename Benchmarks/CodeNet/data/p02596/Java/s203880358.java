import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(s.length()-1);
        if (c != '1' && c != '3' && c != '7' && c != '9') {
            System.out.println(-1);
            return;
        }
        K = Integer.parseInt(s);
        initialize(c - '0');
        System.out.println(func(0, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static int K;
    static int[] ary;
    static int[] ok = new int[]{7, 77, 777, 7777, 77777, 777777, 7777777};
    
    static void initialize(int num) {
        ary = new int[10];
        for (int i = 0; i < 10; i++) {
            int t = num * i;
            ary[t - t/10*10] = i;
        }
    }
    
    static int func(int num, int count) {
        int t = 7 - (num - num/10*10);
        if (t < 0) t = 10 + t;
        num = num + K * ary[t];
        for (int i = 0; i < ok.length; i++) {
            if (num == ok[i]) {
                return count + i + 1;
            }
        }
        return func(num/10, ++count);
    }
}
