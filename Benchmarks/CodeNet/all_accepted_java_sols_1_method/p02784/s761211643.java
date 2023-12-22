import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();

        String result = "No";

        int t = 0;
        for (int i = 0; i < n; i++) {
            t += sc.nextInt();
            if (t >= h) {
                result = "Yes";
                break;
            }
        }


        System.out.println(result);
    }
}