import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int l = scanner.nextInt();
        final int r = scanner.nextInt();

        final List<Integer> mods = new ArrayList<>();
        for (int i = l; i <= Math.min(r, l + 2019); i++) {
            mods.add(i % 2019);
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mods.size(); i++) {
            for (int j = i + 1; j < mods.size(); j++) {
                min = Math.min(min, (mods.get(i) * mods.get(j)) % 2019);
            }
        }

        System.out.println(min);
    }
}