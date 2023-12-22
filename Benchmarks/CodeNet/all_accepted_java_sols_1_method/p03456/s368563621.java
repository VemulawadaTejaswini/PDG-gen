import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] s = in.nextLine().split(" ");
        int num = new Integer(s[0] + s[1]);
        int sqrt = (int) Math.sqrt(num);
        sqrt *= sqrt;
        if (sqrt == num && num % sqrt == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}