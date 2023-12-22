import java.text.ChoiceFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("a " + new ChoiceFormat("-1#'<'|0#==|1#'>'").format(s.nextInt() - s.nextInt()) + " b");
    }
}