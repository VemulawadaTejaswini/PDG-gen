import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern p = Pattern.compile("\\s[A-Za-z]*\\s");
        Matcher m = p.matcher(s);
        if (m.find()) {
            System.out.println("A" + m.group().charAt(1) + "C");
        }

    }
}