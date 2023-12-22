import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        String temp = Integer.toString(N);
        String answer = Integer.toString(Integer.parseInt(temp, 10), K);
        System.out.println(answer.length());
    }
}