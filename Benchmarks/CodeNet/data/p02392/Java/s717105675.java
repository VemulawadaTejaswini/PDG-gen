import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] input = readInput();
        int a = input[0];
        int b = input[1];
        int c = input[2];

        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    public static Integer[] readInput() {
        List<Integer> l = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            l.add(sc.nextInt());
        }
        return l.toArray(new Integer[l.size()]);
    }
}