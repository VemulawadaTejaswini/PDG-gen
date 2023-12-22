import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        Arrays.sort(s);
        if (s[0].equals(s[1]) && s[2].equals(s[3]) && !s[0].equals(s[2])) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
