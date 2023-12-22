import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        char[] S = sc.next().toCharArray();
        int r = 0;
        for (int i = 0; i < N - 2; i++) {
            if (S[i] == 'A' && S[i+1] == 'B' && S[i+2] == 'C') r++;
        }
        System.out.println(r);
    }
}