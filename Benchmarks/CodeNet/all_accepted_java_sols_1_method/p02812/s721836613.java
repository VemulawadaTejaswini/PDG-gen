import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        char[] S = sc.nextLine().toCharArray();
        int cnt = 0;
        for (int i=0; i+2<S.length; i++) {
            if (S[i] == 'A' && S[i+1] == 'B' && S[i+2] == 'C') cnt++;
        }
        System.out.println(cnt);
    }
}
