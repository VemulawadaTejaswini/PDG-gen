import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner stdId = new Scanner(System.in);
        int a = stdId.nextInt();
        int b = stdId.nextInt();
        String j;

        if (a < b) {
            j = "<";
        } else if (a == b) {
            j = "==";
        } else {
            j = ">";
        }

        System.out.println("a " + j + " b");

    }
}