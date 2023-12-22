
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String out = "";
        if (s.equals("Sunny")) {
            out = "Cloudy";
        } else if (s.equals("Cloudy")) {
            out = "Rainy";
        } else {
            out = "Sunny";
        }
        System.out.println(out);

        sc.close();
    }

}
