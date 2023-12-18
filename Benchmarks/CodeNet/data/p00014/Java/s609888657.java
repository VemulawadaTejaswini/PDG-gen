import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int d = Integer.parseInt(sc.next());

            long S = 0;
            for (int i = d; i < 600; i += d) {
                S += Math.pow(i, 2) * d;
            }
            System.out.println(S);
        }
    }
}