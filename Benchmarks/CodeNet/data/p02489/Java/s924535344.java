import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1, x, num;
        while ((x = sc.nextInt()) != 0) {
            num = i++;
            System.out.println("Case " + num + ": " + x );
        }
    }
}