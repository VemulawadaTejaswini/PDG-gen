

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }
        a.sort(Comparator.naturalOrder());
        int answer = 0;
        answer += a.get(1) - a.get(0);
        answer += a.get(2) - a.get(1);
        System.out.println(answer);
    }
}
