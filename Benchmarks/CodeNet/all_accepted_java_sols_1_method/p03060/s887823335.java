import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String[] tmpV = sc.nextLine().split(" ");
        String[] tmpC = sc.nextLine().split(" ");

        int max = 0;
        for (int i = 0; i<N; i++) {
            int t = Integer.valueOf(tmpV[i])-Integer.valueOf(tmpC[i]);
            if (0<t) {
                max += t;
            }
        }

        System.out.println(max);
    }
}