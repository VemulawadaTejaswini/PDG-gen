import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = getInput().get(0);
        ArrayList<Integer> p = getInput();

        int count = 1;
        int tmin = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            tmin = Math.min(p.get(i - 1), tmin);
            if (p.get(i) <= tmin) ++count;
        }

        Print(count);
    }

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Integer> getInput() {
        String in = scanner.nextLine();

        ArrayList<Integer> result = new ArrayList<>();
        for (String t : in.split(" ")) {
            result.add(Integer.parseInt(t));
        }

        return result;
    }

    private static void Print(Object o) {
        System.out.println(o);
    }

    private static void Print(Object... o) {
        for (Object i : o) System.out.print(i);
        System.out.println();
    }
}
