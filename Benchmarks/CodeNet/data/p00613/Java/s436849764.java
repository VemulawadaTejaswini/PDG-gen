import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k, tot = 0;
        while((k = Integer.parseInt(sc.next())) > 0) {
            for (int i = 0, max = k*(k-1)/2; i < max; i++) {
                tot += Integer.parseInt(sc.next());
            }
            System.out.println(tot / (k - 1));
            tot = 0;
        }
    }
}