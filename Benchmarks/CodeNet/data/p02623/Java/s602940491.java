import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        int count = 0;

        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int ai = 0;
        int bi = 0;
        while((ai < a.length && k >= a[ai]) || (bi < b.length && k >= b[bi])) {
            if(ai < a.length && bi < b.length) {
                if(a[ai] == b[bi]) {
                    if(a[ai+1] < b[bi+1] && k >= a[ai]) {
                        k -= a[ai];
                        ai++;
                    } else if(k >= b[bi]) {
                        k -= b[bi];
                        bi++;
                    }
                } else if(a[ai] < b[bi] && k >= a[ai]) {
                    k -= a[ai];
                    ai++;
                } else if(k >= b[bi]) {
                    k -= b[bi];
                    bi++;
                }
            } else if(ai < a.length) {
                if(k >= a[ai]) {
                    k -= a[ai];
                    ai++;
                }
            } else if(bi < b.length) {
                if(k >= b[bi]) {
                    k -= b[bi];
                    bi++;
                }
            }
            count++;
        }

        System.out.println(String.valueOf(count));
    }
}