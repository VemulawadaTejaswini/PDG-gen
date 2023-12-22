import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        int[] AN = new int[N];
        for (int i = 0; i < N; i++) {
            AN[i] = Integer.parseInt(sc.next());
        }

        divede(AN);

        System.out.println(ANS);
    }

    static int ANS;

    private static void divede(int[] aN) {
        for (int i = 0; i < aN.length; i++) {
            int target = aN[i];
            if (target % 2 != 0) {
                return;
            }
            aN[i] = target / 2;
        }
        ANS++;
        divede(aN);
    }
}
