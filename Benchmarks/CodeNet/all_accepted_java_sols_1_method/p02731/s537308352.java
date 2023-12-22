import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();

        double c = (double) l / 3;
        double m = c * c * c;
        System.out.println(String.format("%.8f",m));
    }
}