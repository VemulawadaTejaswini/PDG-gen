import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        stdIn.close();

        int result = (N % 2 == 0) ? N / 2 : (N + 1) / 2;
        System.out.println(result);
    }
}
