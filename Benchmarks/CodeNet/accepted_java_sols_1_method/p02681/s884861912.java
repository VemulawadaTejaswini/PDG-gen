
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        String s = sc.next();
        String t = sc.next();
        System.out.println(t.startsWith(s)&&t.length() == s.length()+1?"Yes":"No");
    }
}
