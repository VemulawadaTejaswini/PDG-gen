

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[10000+1];
        for(int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int total = 0;
        for(int k = 0; k < q; k++) {
            int key = sc.nextInt();
            if(search(S, n, key)) total++;
        }
        System.out.println(total);
    }
    public static boolean search(int a[], int n, int key) {
        int i = 0;
        a[n] = key;
        while(a[i] != key) i++;
        return i != n;
    }
}

