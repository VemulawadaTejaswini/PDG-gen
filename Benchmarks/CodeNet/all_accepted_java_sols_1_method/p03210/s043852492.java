import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
        case 7:
        case 5:
        case 3:
            System.out.println("YES");
            break;

        default:
            System.out.println("NO");
            break;
        }
    }
}