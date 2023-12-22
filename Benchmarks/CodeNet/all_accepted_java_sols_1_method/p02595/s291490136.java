import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            double sum = Math.pow(x, 2) + Math.pow(y, 2);
            if (Math.sqrt(sum) <= d) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
