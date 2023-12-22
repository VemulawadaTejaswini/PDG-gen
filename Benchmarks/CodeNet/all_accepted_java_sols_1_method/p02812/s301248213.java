import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        String s = std.next();
        String abc = "ABC";
        Pattern p = Pattern.compile(abc);
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()) {
            count++;
        }

        System.out.println(count);
    }
}
