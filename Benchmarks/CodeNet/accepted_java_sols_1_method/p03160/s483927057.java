import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] min = new int[n];
        min[0] = 0;
        min[1] = Math.abs(arr[1] - arr[0]);


        for(int i = 2; i < n; i++) {
            min[i] = Math.min(Math.abs(arr[i-2] - arr[i]) + min[i-2], Math.abs(arr[i-1] - arr[i]) + min[i-1]);
            //System.out.println(min[i]);
        }

        System.out.println(min[n-1]);


    }
}
