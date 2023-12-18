

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int[] aa = new int[1000001];
        Arrays.fill(aa, 1);
        for (int k : a) {
            if (aa[k] == 1) {
                for (int i = 2 * k; i < 1000001; i = i + k) {
                    aa[i] = 0;
                }
            }
        }

        int count = 0;
        for (int k : a) {
            if (aa[k] == 1) {
                count++;
                aa[k] = 0;
            }
        }

        System.out.println(count);
    }
}