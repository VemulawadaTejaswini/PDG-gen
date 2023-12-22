import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        int length = s.length();
        char[] data = s.toCharArray();
        String answer = new StringBuilder().append(data[0]).append(length - 2).append(data[length-1]).toString();
        System.out.println(answer);
    }
}
