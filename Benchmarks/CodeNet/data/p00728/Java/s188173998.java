import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> list;

    public static void main(String args[]) throws FileNotFoundException {
        list = new ArrayList<Integer>();
        Scanner stdIn = new Scanner(System.in);
        while (stdIn.hasNext()) {
            list.add(stdIn.nextInt());
        }
        algorith(list.get(0), 1);
    }

    private static void algorith(Integer N, int index) {
        int min = 1000;
        int max = 0;
        int Sum = 0;
        if (list.size() < (N + index + 1)) {
            return;
        }
        for (int i = index; i < (N + index); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
            Sum += list.get(i);
        }
        int result = (Sum - max - min) / (N - 2);
        System.out.println(result);
        algorith(list.get(N + index), N + index + 1);
    }
}

