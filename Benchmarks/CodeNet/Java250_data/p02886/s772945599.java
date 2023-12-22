import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d.add(Integer.parseInt(sc.next()));
        }
        int answer = 0;
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 1 + i; j < n; j++) {
                answer += d.get(i) * d.get(j);
            }
        }
        System.out.println(answer);
        sc.close();
    }
}