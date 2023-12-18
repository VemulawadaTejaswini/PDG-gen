import java.util.Scanner;

// 東京海上日動プログラミングコンテスト2020
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        for(int i=0; i<k; i++) {
            int[] b = new int[n];
            for(int j=0; j<n; j++) {
                for(int h=0; h<n; h++) {
                    if(j-a[j]<=h && h<=j+a[j]) {
                        // O(N^2 * K) とか通る訳がないんやけども…
                        b[h]++;
                    }
                }
            }
            a = b;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(a[i]);
            if(i<n-1) {
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());
    }
}
