import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = 0;
        int a = 0;
        while((a = num.nextInt()) != 0) {
            i++;
            System.out.printf("Case %d: %d\n", i, a);
        }
    }
}
