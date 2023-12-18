import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        
        if (k == 0) {
            for (int i = 0; i < n; i++) {
                if (s == 1000000000) {
                    System.out.print(2);
                } else {
                    System.out.print(s+1);
                }
                if (i != n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                return;
                }
            }
        }
        
        int[] array = new int[n];
        
        for (int i = 0; i < k - 1; i++) {
            array[i] = s;
        }
        
        int tmp = n - (k - 1);
        boolean komaru = false;
        if (tmp > s) {
            komaru = true;
        }
        
        
        if (tmp == s) {
            for (int i = k - 1; i < n; i++) {
                array[i] = 1;
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]);
                if (i != n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                return;
                }
            }
        }
        
        if (komaru) {
            for (int i = k - 1; i < n - 1; i++) {
                if (s == 1000000000) {
                    array[i] = 2;
                } else {
                    array[i] = s + 1;
                }
            }
            array[n - 1] = s;
            
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]);
                if (i != n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                return;
                }
            }
        } else {
            for (int i = k - 1; i < n - 1; i++) {
                array[i] = 1;
            }
            array[n - 1] = s - (n - k);
            
            for (int i = 0; i < n; i++) {
                System.out.print(array[i]);
                if (i != n - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                return;
                }
            }
        }
    }
}
