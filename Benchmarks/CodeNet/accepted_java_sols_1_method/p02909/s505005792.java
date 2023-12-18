import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ret;
        switch (sc.next()) {
            case "Sunny":
                ret = "Cloudy";
                break;
            case "Cloudy":
                ret = "Rainy";
                break;
            default:
                ret = "Sunny";
                break;
        }
        System.out.println(ret);
    }
}
