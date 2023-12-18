import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H1 = Integer.parseInt(sc.next());
        int M1 = Integer.parseInt(sc.next());
        int H2 = Integer.parseInt(sc.next());
        int M2 = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        LocalDateTime date1 = LocalDateTime.of(2020,1,1,H1,M1,0);
        LocalDateTime date2 = LocalDateTime.of(2020,1,1,H2,M2,0);

        System.out.println(ChronoUnit.MINUTES.between(date1,date2)-K);
     }
}