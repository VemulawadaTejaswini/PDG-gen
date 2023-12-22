import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Integer last = null;
        int lastIndex = 0;

        for (int i=0; i<5; i++) {
            int input = sc.nextInt();
            if (input % 10 == 0) list.add(input);
            else {
                if (last == null || input % 10 < last % 10) {
                    last = input;
                    lastIndex = i;
                }

                int next10 = input + 10 - (input % 10);
                list.add(next10);
            }
        }

        int sum = 0;
        if (last == null) {
            for (int each: list) {
                sum += each;
            }
        } else {
            for (int i=0; i<5; i++) {
                if (i != lastIndex) {
                    sum += list.get(i);
                }
            }

            sum += last;
        }

        System.out.println(sum);
    }
}
