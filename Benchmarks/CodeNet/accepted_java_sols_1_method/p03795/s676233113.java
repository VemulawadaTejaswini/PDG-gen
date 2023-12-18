import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int x = 800 * N;
        int y = (N /15) * 200;

        System.out.println(x - y);
    }
}