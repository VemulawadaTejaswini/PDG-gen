import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();
        Arrays.sort(s);

        char[] t = sc.nextLine().toCharArray();
        Arrays.sort(t);

        int result = new String(s).compareTo(new StringBuilder(new String(t)).reverse().toString());
        System.out.println(result < 0 ? "Yes" : "No");
    }
}