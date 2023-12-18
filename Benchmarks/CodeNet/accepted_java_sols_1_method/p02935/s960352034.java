import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] ingredients = new int[N];
        for (int i = 0; i < N; i++) ingredients[i] = in.nextInt();
        Arrays.sort(ingredients);

        float res = (float) (ingredients[0] + ingredients[1]) / 2;
        for (int i = 2; i < N; i++) res = (res + ingredients[i]) / 2;
        System.out.println(res);
    }
}
