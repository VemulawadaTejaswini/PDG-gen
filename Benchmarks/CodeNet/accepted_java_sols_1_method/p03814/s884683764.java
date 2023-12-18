import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Pattern pattern = Pattern.compile("A.+Z");
        Matcher matcher = pattern.matcher(s);

        int length = 0;

        if (matcher.find()) {
            String split = matcher.group();
            if (split.length() > length) {
                length = split.length();
            }
        }

        System.out.println(String.valueOf(length));


    }
}