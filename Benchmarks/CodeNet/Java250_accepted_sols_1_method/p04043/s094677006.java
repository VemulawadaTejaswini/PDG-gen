import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count5 = 0;
        int count7 = 0;

        for (int i = 0; i < 3; i++) {
            switch (sc.nextInt()) {
                case 5:
                    count5++;
                    break;
                case 7:
                    count7++;
                    break;
            }
        }

        if (count5 == 2 && count7 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
