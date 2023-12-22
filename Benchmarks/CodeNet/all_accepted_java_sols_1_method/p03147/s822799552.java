import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }
        
        int ans = h[0];
        for(int i = 0; i < N-1; i++) {
            if(h[i+1] > h[i]) ans += h[i+1] - h[i];
        }
        System.out.println(ans);
    }
}