import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < N; i++){
            int key = scanner.nextInt();
            counter.put(key, counter.getOrDefault(key,0) + 1);
        }

        long R = 0L;
        for (int key : counter.keySet()) {
            boolean isOK = true;

            for (int i = 1; i*i <= key; i++) {
                if (key%i == 0 && counter.containsKey(i)){
                    isOK = false;
                    break;
                }
            }

            if (isOK) R += counter.get(key);
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
