import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = -1;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int tmp = a[i] * a[j];
                if(tmp <= max) continue;
                String s = String.valueOf(tmp);
                boolean ok = true;
                for(int k = 0; k < s.length()-1; k++) {
                    if(s.charAt(k)+1 != s.charAt(k+1)) {
                        ok = false;
                        break;
                    }
                }
                if(ok) {
                    max = tmp;
                }
            }
        }
        System.out.println(max);
    }
}
