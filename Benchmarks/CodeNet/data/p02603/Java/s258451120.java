import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int min = -1, ans=1000;
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int i = 0;
        while (i<N-1 && arr[i]>arr[i+1])i++;
        min = arr[i];
        for (int j = i+1; j < arr.length; j++) {
            if ((j<N-1 && arr[j]>arr[j+1]) || j==N-1) {
                //seell
                int count = ans/min;
                ans += count*(arr[j]-min);

                j++;
                while (j<N-1 && arr[j]>arr[j+1])j++;
                if (j<N-1)min = arr[j];
            }
        }
        System.out.println(ans);
    }

    private static boolean max1(int a, int b, int c, int k) {
        boolean ans = true;
        while (k>0) {
            if (b<=a) {
                b*=2;
                k--;
            } else if (c<=b) {
                c*=2;
                k--;
            }
            if (c>b&&b>a)
                break;
        }
        return c>b&&b>a;
    }

}
