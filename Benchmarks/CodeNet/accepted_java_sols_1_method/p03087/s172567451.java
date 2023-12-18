import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        String S = sc.next();
        int count = 0;
        int[] table = new int[N+1];

        table[0] = 0;
        for(int i = 1; i<=N; i++) {
            if ( i != N && S.charAt(i-1) == 'A' && S.charAt(i) == 'C') {
                count++;
            }
            table[i] = count;
        }
        for (int i = 0; i<Q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println((table[r-1])-(table[l-1]));
        }
    }
}