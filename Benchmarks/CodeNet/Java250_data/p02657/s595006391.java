import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("input.txt"));

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a * b);
    }
}
