import java.util.Scanner;

public class Main {
    // Round by 3 digits
    static float roundUp(float value) {
        float mod = value % 1000;
        if (mod > 0) {
            value = value + (1000 - mod);
        }
        return value;
    }

    public static void main(String[] args) {
        float gankin = 100_000f;
        Scanner sc = new Scanner(System.in);
        int nweek = sc.nextInt();
        float debt = gankin;
        for (int i = 0; i < nweek; i++) {
            debt = roundUp(debt * 1.05f);
        }
        System.out.printf("%d\n", Math.round(debt));
    }
}