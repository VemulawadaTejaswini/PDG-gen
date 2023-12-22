import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int Y = Integer.valueOf(S.substring(0, 4));
        int M = Integer.valueOf(S.substring(5, 7));
        int D = Integer.valueOf(S.substring(8, 10));

        LocalDate P = LocalDate.of(Y, M, D);
        LocalDate mileStone = LocalDate.of(2019, 4, 30);

        if (P.compareTo(mileStone) <= 0)
            System.out.println("Heisei");
        else
            System.out.println("TBD");
    }
}



