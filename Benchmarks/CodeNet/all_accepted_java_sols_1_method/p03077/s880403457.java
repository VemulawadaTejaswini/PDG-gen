import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> abcde = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            abcde.add(sc.nextLong());
        }
        Long min = Collections.min(abcde);
        System.out.println((long) Math.ceil((double) n / min) + 4);
    }

}
