import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        ;
        String[] s = scanner.nextLine().split(" ");
        int h1 = Integer.parseInt(s[0]);
        int m1 = Integer.parseInt(s[1]);
        int h2 = Integer.parseInt(s[2]);
        int m2 = Integer.parseInt(s[3]);
        int k = Integer.parseInt(s[4]);

        LocalTime startTime = LocalTime.of(h1,m1);
        LocalTime endTime = LocalTime.of(h2,m2);

        if(endTime.get(ChronoField.MINUTE_OF_DAY) - k - startTime.get(ChronoField.MINUTE_OF_DAY) > 0){
            System.out.println(endTime.get(ChronoField.MINUTE_OF_DAY) - k - startTime.get(ChronoField.MINUTE_OF_DAY));
        }else{
            System.out.println(0);
        }
    }
}

