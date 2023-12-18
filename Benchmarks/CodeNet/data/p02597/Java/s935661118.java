import java.util.*;

public class Main {
    public static int operate(int[] a) {
        int n = a.length, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 1) cnt++;
        }
        int ret = 0;
        for (int i = 0; i < cnt; i++) {
            if (a[i] == 1) ret++;
        }
        ret = cnt - ret;
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        String s = "";

        while (sc.hasNext()) {
            N = sc.nextInt();
            s = sc.next();
            int[] a = new int[s.length()];
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='W') a[i] = 0;
                else a[i] = 1;
            }
            System.out.println(operate(a));
        }
        sc.close();

    }
}