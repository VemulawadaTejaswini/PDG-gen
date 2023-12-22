import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = X - K + 1; i <= X + K - 1; i++) {
            stringBuilder.append(i)
                    .append(" ");
        }
        System.out.println(stringBuilder.toString());
    }
}