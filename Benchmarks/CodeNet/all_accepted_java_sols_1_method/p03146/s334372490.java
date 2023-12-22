import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        a.add(s);

        int number = 0;

        outside:
        while (s > 0) {
            if (s % 2 == 0) {
                s = s / 2;
                number++;

                if (a.contains(s)) {
                    break outside;
                } else {
                    a.add(s);
                }
            } else {
                s = 3 * s + 1;
                number++;
               
                if (a.contains(s)) {
                    break outside;
                } else {
                    a.add(s);
                }
            }
        }


        System.out.println(number + 1);
    }

}









