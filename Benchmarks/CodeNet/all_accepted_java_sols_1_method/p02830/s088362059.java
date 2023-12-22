import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.next().split("");
        String[] t = sc.next().split("");

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <  n ; i++) {
            builder.append(s[i]);
            builder.append(t[i]);
        }

        System.out.println(builder);
    }
}