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
        
        int index = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (ary[i] > ary[j]) {
                    if (index == -1 || ary[index] > ary[j]) {
                        index = j;
                    }
                }
            }
            if (index > -1) {
                int t = ary[i];
                ary[i] = ary[index];
                ary[index] = t;
                res++;
            }
            index = -1;
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