import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        for (int i=0; i < 3; i++) {
            l.add(sc.nextInt());
        }

        l.sort((Comparator.comparingInt(o -> o)));

        System.out.println(l.get(0) + l.get(1));

    }

}
