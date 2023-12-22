import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) {
                    } else {
                        int a = 0;
                        int b = 0;
                        int c = 0;
                        a = array[i];
                        b = array[j];
                        c = array[k];
                        if (a == b || b == c || a == c) {
                        } else {
                            if (a >= b && a >= c) {
                                if (Math.abs(b - c) < a && a < b + c) {
                                    ans++;
                                }
                            } else if (b >= a && b >= c){
                                if (Math.abs(a - c) < b && b < a + c) {
                                    ans++;
                                }
                            } else if (c >= a && c >= b){
                                if (Math.abs(b - a) < c && c < a + b) {
                                    ans++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ans / 6);

        sc.close();

        }

    }

