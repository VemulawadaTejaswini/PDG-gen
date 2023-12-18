import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        List<Integer> xs = new ArrayList<>();
        for (String s1 : s) {
            xs.add(Integer.parseInt(s1));
        }

        int min = Integer.MAX_VALUE;
        for (int p = 1; p <= 100; p++) {
            int sum = 0;
            for (Integer x : xs) {
                sum += (x-p) * (x-p);
            }
            if(sum < min) {
                min = sum;
            }
        }
        System.out.println(min);
    }
}
