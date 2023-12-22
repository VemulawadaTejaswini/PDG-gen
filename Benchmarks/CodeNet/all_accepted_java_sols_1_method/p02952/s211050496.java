import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        for (int i = n; i >= 1; i--) {
            if (Integer.toString(i).length() % 2 == 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}
