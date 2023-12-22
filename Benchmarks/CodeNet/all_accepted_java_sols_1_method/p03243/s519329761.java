import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        final int baseCount = 111;
        final int input = new Scanner(System.in).nextInt();
        int result;
        if (input % baseCount == 0) {
            result = input;
        } else {
            result = (input / baseCount + 1) * baseCount;
        }
        System.out.println(result);
    }
}