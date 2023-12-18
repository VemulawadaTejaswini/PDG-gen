import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a / 500;
        int c = (a % 500) / 5;
        System.out.println(1000 * b + 5 * c);
    }
}