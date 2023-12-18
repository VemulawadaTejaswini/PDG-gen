import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> positiveList = new ArrayList<>();
        ArrayList<Integer> negativeList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int ret = sc.nextInt();
            if (ret >= 0) {
                positiveList.add(ret);
            } else {
                negativeList.add(Math.abs(ret));
            }
        }

        Collections.sort(positiveList);
        Collections.sort(negativeList);

        long minDistance = Long.MAX_VALUE;
        for (int positiveNum = Math.max(0, K - negativeList.size()); positiveNum <= positiveList.size(); positiveNum++) {
            long positiveRoute = 0;
            if (K - positiveNum - 1 >= 0) positiveRoute += negativeList.get(K - positiveNum - 1);
            if (positiveNum - 1 >= 0) positiveRoute += 2 * positiveList.get(positiveNum - 1);

            long negativeRoute = 0;
            if (K - positiveNum - 1 >= 0) negativeRoute += 2 * negativeList.get(K - positiveNum - 1);
            if (positiveNum - 1 >= 0) negativeRoute += positiveList.get(positiveNum - 1);


            long route = Math.min(positiveRoute, negativeRoute);

            minDistance = Math.min(minDistance, route);
        }

        System.out.println(minDistance);

    }
}