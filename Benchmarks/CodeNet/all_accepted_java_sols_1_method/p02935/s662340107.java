import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        float[] ingredients = new float[N];
        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            ingredients[i] = v;
        }
        Arrays.sort(ingredients);
        for (int i = 1; i < N; i++) {
            float composition = (ingredients[i - 1] + ingredients[i]) / 2;
            ingredients[i] = composition;
        }
        System.out.println(ingredients[N - 1]);
    }
}
