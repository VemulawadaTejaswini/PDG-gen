import java.util.*;

public class Main {
    static ArrayList<Integer> packages = new ArrayList<>();
    static int trucks;
    static int total;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        total = inp.nextInt();
        trucks = inp.nextInt();

        int sum = 0;

        for(int i = 0; i < total; i++){
            int item = inp.nextInt();
            packages.add(item);
            sum += item;
        }

        int lower = 0;

        int answer = sum;
        while (lower <= sum) {
            int mid = (sum+lower)/2;

            if (check(mid)) {
                answer = mid;
                sum = mid - 1;
            } else { lower = mid + 1;}
        }

        System.out.println(answer);
    }

    static boolean check(int p) {
        int cntTruck = 1, currentTruck = 0;
        for (int i = 0; i < total; i++) {
            if (currentTruck + packages.get(i) <= p) {
                currentTruck += packages.get(i);
            } else {
                if (cntTruck >= trucks) return false;
                cntTruck++;
                if (packages.get(i) > p) return false;
                currentTruck = packages.get(i);
            }
        }

        return true;
    }
}

