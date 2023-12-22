import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        String steps = sc.nextLine();

        for (int i = 0; i < 4; i++) {
            char ch = steps.charAt(i);
            if (ch == '+')
                result++;
            else if (ch == '-')
                result--;
        }
        System.out.println(result);
    }
}
