import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int purchase = sc.nextInt();
        int ticket = sc.nextInt();
        Queue<Double> eachAmount = new PriorityQueue<>(purchase, Comparator.reverseOrder());
        for (int i = 0; i < purchase; i++) {
            eachAmount.add((double) sc.nextInt());
        }
        for (int i = 0; i < ticket; i++) {
            double max = eachAmount.poll();
            eachAmount.add(max / 2);
        }
        long sum = 0;
        for (double amount : eachAmount) {
            sum += Math.floor(amount);
        }
        System.out.println(sum);
    }
}