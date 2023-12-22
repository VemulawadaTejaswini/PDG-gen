import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt()-1;
        String S = sc.next();
        char[] C = S.toCharArray();
        char targetChar = C[K];

        String targetString = String.valueOf(targetChar);
        targetString = targetString.toLowerCase();

        char[] tmp = targetString.toCharArray();
        C[K] = tmp[0];

        for (char c : C) {
            System.out.print(c);
        }
    }
}
