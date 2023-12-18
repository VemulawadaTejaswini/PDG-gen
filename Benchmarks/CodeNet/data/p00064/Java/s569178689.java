import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final Pattern DIGIT = Pattern.compile("([0-9]+)");

    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Matcher matcher = DIGIT.matcher(scanner.nextLine());
            while (matcher.find()) {
                sum += Integer.parseInt(matcher.group());
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}

