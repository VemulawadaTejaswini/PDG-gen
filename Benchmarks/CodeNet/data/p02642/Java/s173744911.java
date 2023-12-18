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

        if (counter.containsKey(1)){
            if (counter.get(1) == 1){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
            return;
        }

        long R = 0L;
        for (int key : counter.keySet()) {
            boolean isOK = true;

            if (counter.get(key) > 1) continue;

            for (int i = 2; i*i <= key; i++) {
                if (key%i == 0){
                    if(counter.containsKey(i) || counter.containsKey(key/i)){
                        isOK = false;
                        break;
                    }
                }
            }

            if (isOK) R += (long)counter.get(key);
        }

        System.out.println(R);
    }

    public static void main(String[] args) {
        new Main();
    }
}
