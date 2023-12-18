import java.util.Scanner;

/**
 * Created by khrom on 2017/06/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner square = new Scanner(System.in).useDelimiter("\\s");
        int ans = square.nextInt() * square.nextInt();
        System.out.println(ans);
    }
}