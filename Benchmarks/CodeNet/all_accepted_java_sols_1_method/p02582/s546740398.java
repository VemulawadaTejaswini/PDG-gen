
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] S = scanner.next().toCharArray();

        int count = 0;

        if (S[0] == 'R' && S[1] == 'R' && S[2] == 'R') {
            count = 3;
        } else if ((S[0] == 'R' && S[1] == 'R')|| (S[1] == 'R' && S[2] == 'R')) {
            count = 2;
        } else if (S[0] == 'R' || S[1] == 'R' || S[2] == 'R') {
            count = 1;
        }
        System.out.println(count);

    }
}
