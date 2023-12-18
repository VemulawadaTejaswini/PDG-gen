import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdId = new Scanner(System.in);
        int a = stdId.nextInt();
        int b = stdId.nextInt();
        int c = stdId.nextInt();

        String j = "No";

        if (a < b && b < c) {
            j = "Yes";
        }

        System.out.println(j);

    }
}