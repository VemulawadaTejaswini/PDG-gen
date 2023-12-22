import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        Integer[] numList = new Integer[n];
        for (int i = 0; i < n; i++) {
            numList[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(numList, Collections.reverseOrder());
        int sumAlice = 0;
        int sumBob = 0;
        for (int i = 0; i < numList.length; i++) {
            if (i % 2 == 0) {
                sumAlice += numList[i];
            } else {
                sumBob += numList[i];
            }
        }

        System.out.println(sumAlice - sumBob);
    }
}
