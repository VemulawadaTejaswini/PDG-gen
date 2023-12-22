
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String[] dayoftheweek = new String[8];
        String str = scanner.nextLine();
        int result = 7;

        for(int i = 1; i <= 7; i++) {
            dayoftheweek[i] = DayOfWeek.of(i).getDisplayName(TextStyle.SHORT_STANDALONE, Locale.US).toUpperCase();
            if (dayoftheweek[i].equals(str) != dayoftheweek[i].equals("SUN")) {
                result = 7 - i;
                break;
            }
        }
        System.out.println(result);
    }
}