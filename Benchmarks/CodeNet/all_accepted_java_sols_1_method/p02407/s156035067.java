import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num;

        num = Integer.parseInt(scan.next());
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(scan.next()));
        }
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i != 0) {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }
}

