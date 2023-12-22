import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String today = sc.next();
        List<String> week = new ArrayList<>(Arrays.asList("SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"));

        System.out.println(week.indexOf(today) + 1);

    }
}
