import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] values = input.split(" ");
        int A = Integer.parseInt(values[0]);
        int B = Integer.parseInt(values[1]);
        int C = Integer.parseInt(values[2]);

        int x = A - B;
        int answer;
        if (x <= C) {
            answer = C - x;
        } else {
            answer = 0;
        }

        System.out.println(answer);
    }
}
