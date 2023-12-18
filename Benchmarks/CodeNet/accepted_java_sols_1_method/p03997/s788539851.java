import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a, b, h;
        a = in.nextInt();
        b = in.nextInt();
        h = in.nextInt();
        System.out.println( ((a+b)*h)/2 );
    }
}