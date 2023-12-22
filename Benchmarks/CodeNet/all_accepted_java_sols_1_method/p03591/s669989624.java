import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();

        boolean yaki = true;
        if (S.length() < 4) yaki = false;
        else if (!S.substring(0, 4).equals("YAKI")) yaki = false;
        System.out.println(yaki?"Yes":"No");
    }
}
