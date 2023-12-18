import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        a = (int)(a + Math.pow(a, 2) + Math.pow(a, 3));
        System.out.println(a);
    }
}
