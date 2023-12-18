import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        boolean answer = A<=C && C<=B;
        System.out.println(answer ? "Yes" : "No");
    }
}
