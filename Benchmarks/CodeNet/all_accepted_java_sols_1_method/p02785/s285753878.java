import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int N = Integer.parseInt(values[0]);
        int K = Integer.parseInt(values[1]);
        if (N <= K) {
            System.out.println("0");
            return;
        }
        line = scanner.nextLine();
        values = line.split(" ");
        ArrayList<Long> monsters = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            monsters.add(Long.valueOf(values[i]));
        }
        Collections.sort(monsters);
        Collections.reverse(monsters);
        long atks = 0;
        for (int i = 0; i < monsters.size(); i++) {
            if (i + 1 > K) {
                atks += monsters.get(i);
            }
        }
        System.out.println(atks);
    }
}