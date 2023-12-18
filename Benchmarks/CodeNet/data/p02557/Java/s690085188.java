//package Test;

import java.util.*;

public class Main {

    static class Solution {

        void solve(int n, int[] a, int[] b){
            int[] res = new int[n];
            int left = n, count = 0;
            for(int i = 0, j = 0; i < n; i++) {
                while(left >= 0) {
                    if(b[j] == 0 || a[i] == b[j]) {
                        count++;
                        if(count == left) {
                            System.out.println("No");
                            return;
                        }
                        j = (j + 1) % n;
                        continue;
                    }
                    res[i] = b[j];
                    b[j] = 0;
                    left--;
                    count = 0;
                    j = (j + 1) % n;
                    break;
                }
            }
            System.out.println("Yes");
            for(int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++) a[i] = scanner.nextInt();
        for(int i = 0; i < n; i++) b[i] = scanner.nextInt();
        Solution solution = new Solution();
        solution.solve(n, a, b);

    }
}
