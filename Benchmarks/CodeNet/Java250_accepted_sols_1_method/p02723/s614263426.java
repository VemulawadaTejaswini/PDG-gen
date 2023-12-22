import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] splitS = S.split("");
        boolean result = splitS[2].equals(splitS[3]) && splitS[4].equals(splitS[5]);
        System.out.println(result ? "Yes" : "No");
    }
}
