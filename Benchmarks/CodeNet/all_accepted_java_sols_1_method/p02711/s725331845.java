import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String judge = "No";
        for (int i = 0; i < 3; i++) {
            if (N.charAt(i) == '7') {
                judge = "Yes";
                break;
            }
        }
        System.out.println(judge);

    }
}