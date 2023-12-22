import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        int a = s1.toCharArray()[0]-32;
        int b = s2.toCharArray()[0]-32;
        int c = s3.toCharArray()[0]-32;
        StringBuilder sb = new StringBuilder();
        sb.append((char)a);
        sb.append((char)b);
        sb.append((char)c);
        System.out.println(sb.toString());
    }
}
