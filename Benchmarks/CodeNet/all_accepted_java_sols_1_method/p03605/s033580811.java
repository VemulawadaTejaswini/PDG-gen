import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println((N%10==9 || N/10==9) ? "Yes" : "No");
    }
}
