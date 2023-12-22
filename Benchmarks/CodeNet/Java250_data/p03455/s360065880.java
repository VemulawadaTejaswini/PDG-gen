import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] s = in.nextLine().split(" ");
        long s1 = new Long(s[0]);
        long s2 = new Long(s[1]);
        long ss = s1 * s2;
        if (ss % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}