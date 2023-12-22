import java.util.Scanner;
import java.util.Arrays;

class Main {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a, l;
        while (true) {
            a = sc.nextInt();
            l = sc.nextInt();
        
            if (a == 0 && l == 0) break;
            int[] ans = new int[21];
            ans[0] = a;
        
            int[] tmp = new int[l];
        
            for (int k = 0; k < 20; k++) {
                a = ans[k];
                for (int i = 0; i < l; i++) {
                    tmp[i] = a % 10;
                    a /= 10;
                }
                Arrays.sort(tmp);
                int min = 0;
                for (int i = 0; i < l; i++) {
                    min = min * 10 + tmp[i];
                }
                int max = 0;
                for (int i = 0; i < l; i++) {
                    max = max * 10 + tmp[l - i - 1];
                }
                ans[k+1] = max - min;
            }
            
            boolean f = false;
            for (int i = 0; i <= 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (ans[i] == ans[j]) {
                        System.out.println(j + " " + ans[i] + " " + (i - j));
                        f = true;
                        break;
                    }
                }
                if (f) break;
            }
        }
    }
}
