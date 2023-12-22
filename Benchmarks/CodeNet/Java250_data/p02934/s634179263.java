import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        float sumRevertA = 0;
        for (int i = 0; i < N; i++) {
            float a = Float.parseFloat(sc.next());
            sumRevertA += (1f / a);
        }

        System.out.println(1f / sumRevertA);
    }
}