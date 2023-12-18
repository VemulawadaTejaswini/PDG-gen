import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = "Yes";
        if (a == b && a == c) {
            result = "No";
        } else if (a != b && a != c && b != c) {
            result = "No";
        }


        System.out.println(result);
    }
}