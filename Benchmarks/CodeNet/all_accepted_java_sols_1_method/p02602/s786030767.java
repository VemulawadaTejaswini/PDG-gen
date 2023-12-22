import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] scores = new int[n];
        
        for(int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        for(int gakki = k + 1; gakki <= n; gakki++) {
            if(scores[gakki - k - 1] < scores[gakki - 1]) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}