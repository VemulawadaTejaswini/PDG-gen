import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] inputs = readInput();
        System.out.println(xCubic(inputs[0]));
    }

    public static int xCubic(int x) {
        return x * x * x;
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