//package oct30;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner io = new Scanner(System.in);

    public static void main(String[] args) {

        int N = io.nextInt();
        io.nextLine();

        ArrayList<ArrayList<Integer>> day = new ArrayList<>();
        ArrayList<ArrayList<Integer>> max = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            day.add(new ArrayList<Integer>());
            for (int j = 0; j < 3; j++) day.get(i).add(io.nextInt());
            io.nextLine();
            max.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < 3; i++) {
            max.get(0).add(day.get(0).get(i));
        }

        for (int i = 1; i < N; i++) {
            max.get(i).add(Math.max(max.get(i-1).get(1), max.get(i-1).get(2)) + day.get(i).get(0));
            max.get(i).add(Math.max(max.get(i-1).get(0), max.get(i-1).get(2)) + day.get(i).get(1));
            max.get(i).add(Math.max(max.get(i-1).get(0), max.get(i-1).get(1)) + day.get(i).get(2));
        }

        System.out.println(Math.max(Math.max(max.get(N-1).get(0), max.get(N-1).get(1)), max.get(N-1).get(2)));
    }
}
