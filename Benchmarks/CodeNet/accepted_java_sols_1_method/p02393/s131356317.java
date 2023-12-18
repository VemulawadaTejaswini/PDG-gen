import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input[] = { sc.nextInt(), sc.nextInt(), sc.nextInt() };
        int tmp;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    tmp = input[i];
                    input[i] = input[j];
                    input[j] = tmp;
                }
            }
        }
        StringBuffer sb = new StringBuffer(input[0] + " " + input[1] + " "
                + input[2]);
        System.out.println(sb);
    }
}