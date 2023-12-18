import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        int maxPoint = x + k - 1;
        int minPoint = x - k + 1;

        for (int i = minPoint; i <= maxPoint; i++) {
            System.out.print(i + " ");
        }
    }
}