import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int A = 0;
        int B = 0;
        long answer = 0;

        Map<Integer, Integer> energyMap = new TreeMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {

            A = sc.nextInt();
            B = sc.nextInt();

            if (energyMap.containsKey(A)) {
                energyMap.put(A, energyMap.get(A) + B);
            } else {
                energyMap.put(A, B);
            }
        }

        int counter = 0;
        for (Map.Entry<Integer, Integer> energy : energyMap.entrySet()) {
            int energyPrice = energy.getKey();
            for (int i = 0; i < energy.getValue(); i++) {
                answer = answer + energyPrice;
                counter++;
                if (counter == M) {
                    break;
                }
            }
            if (counter == M) {
                break;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}