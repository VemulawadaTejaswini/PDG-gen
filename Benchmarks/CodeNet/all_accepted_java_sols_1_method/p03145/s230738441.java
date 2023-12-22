import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int AB = scan.nextInt();
        int BC = scan.nextInt();
        int CA = scan.nextInt();
        System.out.println(AB*BC/2);
    }
}
