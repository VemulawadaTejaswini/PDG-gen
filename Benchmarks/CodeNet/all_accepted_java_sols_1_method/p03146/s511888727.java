import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        for (int i = 1;; i++) {
            int x = list.get(i - 1);
            if(x % 2 == 0){
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            if (list.contains(x)) {
                System.out.println(i + 1);
                break;
            }
            list.add(x);
       }

    }
}
