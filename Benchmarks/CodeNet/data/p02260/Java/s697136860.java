import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < n - 1; i++) {
            int minj = i;
            for(int j = i + 1; j < n; j++) {
                if(a[j] < a[minj]) minj = j;
            }

            if(i != minj){
                int tmp = a[i];
                a[i] = a[minj];
                a[minj] = tmp;
                ans++;
            }
        }

        printArray(a, n);
        System.out.println(ans);
    }

    private static void printArray(int[] a, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i != 0) sb.append(" ");
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}
