import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long x = in.nextLong();
        long t = in.nextLong();
        long res = (x-t < 0) ? 0: x-t;
        System.out.println(res);
    }
}