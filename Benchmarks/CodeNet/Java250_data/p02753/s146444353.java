import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i = 1; i < 3; i ++){
            if (str.charAt(0) != str.charAt(i)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
