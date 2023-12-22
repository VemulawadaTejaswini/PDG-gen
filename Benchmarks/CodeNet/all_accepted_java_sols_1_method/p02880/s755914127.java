import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        StringBuilder answer = new StringBuilder();
        answer.append("No");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if ((i * j) == n) {
                    answer.setLength(0);
                    answer.append("Yes");
                    break;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}