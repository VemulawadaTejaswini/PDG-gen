import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int[] toWhite = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            toWhite[i] = toWhite[i-1];
            if (S.charAt(i-1) == '#') {
                toWhite[i]++;
            }
        }

        int[] toBlack = new int[N+1];
        for (int i = N-1; i >= 0; i--) {
            toBlack[i] = toBlack[i+1];
            if (S.charAt(i) == '.') {
                toBlack[i]++;
            }
        }

        int min = N;
        for (int i = 0; i < N+1; i++) {
            min = Math.min(min, toWhite[i]+toBlack[i]);
        }

        System.out.println(min);
    }
}
