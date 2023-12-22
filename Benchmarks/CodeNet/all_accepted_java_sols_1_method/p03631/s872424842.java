import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        String s = Integer.toString(n);
        char[] data = s.toCharArray();
        boolean answer = false;
        if (data[0] == data[2]) {
            answer = true;
        }
        System.out.println(answer ? "Yes" : "No");
    }
}
