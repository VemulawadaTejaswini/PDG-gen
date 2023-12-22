import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int all = scanner.nextInt();
        int num = scanner.nextInt();

        ArrayList<Integer> priceList = new ArrayList<>();
        for(int i = 0; i < all; i++) {
            priceList.add(scanner.nextInt());
        }
        Collections.sort(priceList);
        int cost = 0;
        for (int i = 0; i < num; i++) {
            cost += priceList.get(i);
        }
        System.out.println(cost);
    }
}