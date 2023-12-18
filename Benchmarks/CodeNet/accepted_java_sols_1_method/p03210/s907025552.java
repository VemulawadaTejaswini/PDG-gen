import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String res = "NO";

        switch (age) {
            case 3:
            case 5:
            case 7:
                res = "YES";
            default:
        }

        System.out.println(res);
    }
}
