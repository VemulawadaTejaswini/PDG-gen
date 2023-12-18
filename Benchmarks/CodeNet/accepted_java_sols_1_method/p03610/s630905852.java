import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = scan.next();
        char[] data = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i * 2 < data.length; i++) {
            sb.append(data[i*2]);
        }
        System.out.println(sb.toString());
    }
}
