import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] input = readInput();

        Arrays.sort(input, 0, 3);
        System.out.printf("%d %d %d\n", input[0], input[1], input[2]);
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