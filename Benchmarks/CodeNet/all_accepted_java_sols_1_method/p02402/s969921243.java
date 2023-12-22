
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = sc.nextInt();
        long sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num; i++){
            int col = sc.nextInt();
            sum += col;
            list.add(col);
        }
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println(min + " " + max + " " + sum);
    }
}

