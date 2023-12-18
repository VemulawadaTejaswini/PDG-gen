import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> As = new HashSet<>();
        for (int i = 0; i < N; i++) {
            As.add(sc.nextInt());
        }
        int counter = 0;
        int i = 0;
        for (int in : As) {
            boolean divided = false;
            int j = 0;
            for (int jn : As) {
                if (i != j && in % jn == 0) {
                    divided = true;
                    break;
                }
                j++;
            }
            if (!divided) {
                counter++;
            }
            i++;
        }
        System.out.println(counter);
    }
}