

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        double res = 0;
        double tmp = (double)(arr[0] + arr[1])/2;
        for(int i = 2; i < N; i++) {
            if(arr.length == 2) break;
            tmp = (tmp + arr[i]) / 2;
        }
        System.out.println(tmp);
    }
}
