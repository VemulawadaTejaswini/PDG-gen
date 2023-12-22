import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        int count = 0;
        boolean isA = false;
        boolean isB = false;
        for (int i = 0; i < N-2; i++) {
            if (S[i] == 'A' && S[i+1] == 'B' && S[i+2] == 'C') count++;
        }
        System.out.println(count);
    }
}
