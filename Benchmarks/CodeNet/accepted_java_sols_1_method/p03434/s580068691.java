import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> cards = new ArrayList<>();
        int alliceSum = 0;
        int bobSum = 0;
        for (int i = 0; i < n; i++) {
            cards.add(sc.nextInt());
        }
        Collections.sort(cards, Comparator.reverseOrder());

        int current = 2;
        while (cards.size() > 0) {
            if (current % 2 == 0) {
                alliceSum += cards.get(0);
            } else {
                bobSum += cards.get(0);
            }
            cards.remove(0);
            current++;
        }

        System.out.println(alliceSum - bobSum);

    }
}