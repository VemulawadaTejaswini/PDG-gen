import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int textSize = sc.nextInt();
        String text = sc.next();
        if (textSize % 2 == 0) {
            String first = text.substring(0, textSize / 2);
            String second = text.substring(textSize / 2);
            if (first.equals(second)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
