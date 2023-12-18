

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(target);
            return;
        }
        int[] A = new int[n];


        for (int i = 0; i < n; i ++ ) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        int smallest = A[0], largest = A[n - 1];
        int newN = A[n - 1] - A[0] + 1; //-n
        int newN2 = A[n - 1] - A[0] + 1 - n;

        int[] temp = new int[newN];
        int[] res = new int[newN2];

        int j = 0;
        for (int i = smallest; i <= largest; i ++ ) {
            temp[j ++ ] = i;
        }




        int k = 0, l = 0, index = 0;
        while (k < A.length && l < temp.length) {
            if (A[k] == temp[l]) {
                k ++ ;
                l ++ ;
            } else {
                res[index] = temp[l];
                l ++ ;
                index ++ ;
            }
        }




        int left = 0, right = newN2 - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target < res[mid]) {
                right = mid;
            } else if (res[mid] < target) {
                left = mid;
            }
        }
        if (Math.abs(res[left] - target) < Math.abs(res[right] - target)) {
            System.out.println(res[left]);
        } else {
            System.out.println(res[right]);
        }

    }
}



