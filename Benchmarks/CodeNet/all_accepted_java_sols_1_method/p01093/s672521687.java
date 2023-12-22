import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }

            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = Integer.MAX_VALUE;
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(i != j) {
                        int diff = Math.abs(arr[i]-arr[j]);
                        ans = Math.min(ans, diff);
                    }
                }
            }
            System.out.println(ans);
        }

    }
}

