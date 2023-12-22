import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                if (ary[j] < ary[j-1]) {
                    int t = ary[j];
                    ary[j] = ary[j-1];
                    ary[j-1] = t;
                    res++;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i != n-1) {
                System.out.print(ary[i]);
                System.out.print(" ");
            } else {
                System.out.println(ary[i]);
            }
        }
        System.out.println(res);
    }
}