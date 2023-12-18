import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] date = scanner.next().split("");
        date[3] = "8";
        StringBuilder d = new StringBuilder();
        for (String aDate : date) {
            d.append(aDate);
        }
        System.out.println(d);

    }
}
