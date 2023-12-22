
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.next());

        int page = (int)Math.ceil(n / 2);


        System.out.println(page);
    }
}