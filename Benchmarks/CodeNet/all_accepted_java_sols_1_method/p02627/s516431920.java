import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();

        Pattern p = Pattern.compile("[a-z]+");
        Matcher m = p.matcher(a);

        if (m.find()) {
            System.out.println("a");
        } else {
            System.out.println("A");
        }

    }
}