import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");
        sc.close();

        Arrays.sort(s);

        String str = String.join("", s);
        String zero = str.replace("1", "");
        String one = str.replace("0", "");

        int num = Math.abs(zero.length() - one.length());

        System.out.println(str.length() - num);
    }
}