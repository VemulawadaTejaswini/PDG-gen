
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();

        if(x.contains("ABC")) System.out.println("ARC");
        else System.out.println("ABC");
    }
}
