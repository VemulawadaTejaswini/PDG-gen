import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> As = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            As.add(sc.nextInt());
        }
        Collections.sort(As);
        int counter = 0;
        for (int i = 0; i < As.size(); i++) {
            boolean divided = false;
            for (int j = 0; j < As.size(); j++) {
                if (i != j && As.get(i) % As.get(j) == 0) {
                    divided = true;
                    break;
                }
            }
            if (!divided) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}