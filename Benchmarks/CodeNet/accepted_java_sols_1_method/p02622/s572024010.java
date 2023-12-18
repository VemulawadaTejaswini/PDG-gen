import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (T.charAt(i) != S.charAt(i)){
                count++;
            }
        }


        System.out.println(count);
    }
}
