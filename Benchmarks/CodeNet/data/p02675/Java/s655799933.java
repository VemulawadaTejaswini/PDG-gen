import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine();
        int N = int(sc.nextLine());
        String unit;
        switch (N) {
            case 3:
                unit = "bon";
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                unit = "pon";
                break;
            default:
                unit = "hon";
                break;
        }
        System.out.println(N + unit);
    }
}