import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int sheep = in.nextInt();
        int wolves = in.nextInt();
        System.out.println(sheep <= wolves ? "unsafe" : "safe");
    }
}