import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String r;
        switch (s) {
            case "Sunny":
                r = "Cloudy";
                break;
            case "Cloudy":
                r = "Rainy";
                break;
            default:
                r = "Sunny";
                break;
        }
        System.out.println(r);
    }
}
