import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.next());
        List<Integer> d = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            d.add(Integer.parseInt(scanner.next()));
        }

        int sum = 0;

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                sum = sum + d.get(i) * d.get(j);
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}