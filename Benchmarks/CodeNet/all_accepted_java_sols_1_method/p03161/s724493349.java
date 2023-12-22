//package oct30;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner io = new Scanner(System.in);

    public static void main(String[] args) {

        int N = io.nextInt();
        int K = io.nextInt();
        io.nextLine();

        ArrayList<Integer> stones = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            stones.add(io.nextInt());
        }
        ArrayList<Integer> min = new ArrayList<>();
        min.add(0);
        min.add(Math.abs(stones.get(0) - stones.get(1)));

        for (int i = 2; i < N; i++) {
            min.add(Math.abs(stones.get(i)-stones.get(i-1))+min.get(i-1));
//            System.out.println("add initial " + min.get(i));
//            System.out.println("i-K=" + (i-K) + "; j=" + (i-2));
            for (int j = i-2; j >= i-K; j--) {
                if (j >= 0) {
                    int curr = min.get(i);
                    int check = Math.abs(stones.get(i) - stones.get(j)) + min.get(j);
                    min.set(i, Math.min(curr, check));
//                    System.out.println("set min: " + min.get(i));
                }

            }

//
//            System.out.print("array so far: ");
//            for (int j : min) System.out.print(j + " ");
//            System.out.println();
        }
        System.out.println(min.get(N-1));

    }
}
