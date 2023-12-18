import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> listA = new ArrayDeque<>();
        Deque<Integer> listB = new ArrayDeque<>();
        int maxA = sc.nextInt();
        int maxB = sc.nextInt();
        int maxMinutes = sc.nextInt();
        for (int i = 0; i < maxA; i++) {
            listA.add(sc.nextInt());
        }
        for (int i = 0; i < maxB; i++) {
            listB.add(sc.nextInt());
        }
        int minutes = 0;
        int count = 0;
        while (minutes <= maxMinutes) {
            if (listA.size() <= 0 && listB.size() <= 0) {
                count++;
                break;
            }
            else if (listA.size() <= 0) {
                minutes = listB.removeFirst();
            }
            else if (listB.size() <= 0) {
                minutes = listA.removeFirst();
            }
            else {
                minutes = listA.getFirst() <= listB.getFirst() ?
                        listA.removeFirst() : listB.removeFirst();
            }
            count++;
        }
        System.out.println(count - 1);
    }
}