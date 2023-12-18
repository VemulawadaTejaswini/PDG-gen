

import java.util.Scanner;

public class Main {
    static int[] A = new int[1000000];
    static int n;

    public static int binarySearch(int key) {
        int left = 0;
        int right = n;
        int mid;

        while(left < right)
        {
            mid = (left + right) / 2;
            if(key == A[mid]) return 1;
            if(key > A[mid]) left = mid + 1;
            else if(key < A[mid]) right = mid;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i, q, k, sum = 0;
        for(i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        q = sc.nextInt();
        for(i = 0; i < q; i++) {
            k = sc.nextInt();
            if(binarySearch(k) == 1) sum++;
        }
        System.out.println(sum);
    }
}

