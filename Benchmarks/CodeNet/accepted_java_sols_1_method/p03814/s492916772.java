import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        scanner.close();

        Pattern p = Pattern.compile("[A][A-Z]*[Z]");
        Matcher matcher = p.matcher(s);
        int max = 0;
        while (matcher.find()) {
            int length = matcher.group().length();
            if (max < length) {
                max = length;
            }
        }

        System.out.println(max);
    }
}
