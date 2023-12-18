import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(c / (7 * a + b) * 7 + Math.min((c % (7 * a + b) + a - 1) / a, 7));
    }
}
