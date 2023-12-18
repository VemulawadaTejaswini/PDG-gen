import java.util.*;
import java.io.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(Math.min(c,b/a));
    }
}