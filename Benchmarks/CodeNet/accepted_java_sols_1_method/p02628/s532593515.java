import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int sum = 0;
        List<Integer> prices = new ArrayList<Integer>();
        while (scanner.hasNext()){
          prices.add(scanner.nextInt());
        }
        prices.sort(Comparator.naturalOrder());
        for (int i = 0; i < K; i++) {
            sum += prices.get(i);
        }
        System.out.println(sum);



        scanner.close();
    }
}
