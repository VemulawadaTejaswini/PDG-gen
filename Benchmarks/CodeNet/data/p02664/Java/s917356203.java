import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String T = sc.next();
        sc.close();

        String result = T.replaceAll("\\?\\?", "PD");
        result = result.replaceAll("\\?D", "PD");
        result = result.replaceAll("\\?", "D");
        System.out.println(result);
    }
}