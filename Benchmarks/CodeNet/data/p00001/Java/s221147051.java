import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            heights.add(sc.nextInt());
        }
        heights.sort((o1, o2) -> o2 - o1);
        System.out.println(heights.get(0));
        System.out.println(heights.get(1));
        System.out.println(heights.get(2));
    }
}
