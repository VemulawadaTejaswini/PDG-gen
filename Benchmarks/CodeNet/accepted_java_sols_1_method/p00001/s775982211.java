import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        ArrayList<Integer> heights = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            heights.add(sc.nextInt());
        }

        Collections.sort(heights, Collections.reverseOrder());

        for (int i = 0; i < 3; i++) {
            System.out.println(heights.get(i));
        }
    }
}