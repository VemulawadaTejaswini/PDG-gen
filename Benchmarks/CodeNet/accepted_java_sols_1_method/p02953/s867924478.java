import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String N = scanner.nextLine();
        int n = Integer.parseInt(N);
        String line = scanner.nextLine();
        String[] strs = line.split(" ");
        int[] values = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            values[i] = Integer.parseInt(strs[i]);
        }

        boolean[] changed = new boolean[n];
        boolean can = true;
        while (true) {
            boolean hasChanged = false;
            int i;
            for (i = 1; i < values.length; i++) {
                if (values[i] < values[i - 1]) {
                    if (!changed[i - 1]) {
                        values[i - 1] = values[i - 1] - 1;
                        changed[i - 1] = true;
                        hasChanged = true;
                    } else {
                        can = false;
                        break;
                    }
                }
            }
            if (hasChanged) {
                continue;
            }
            if (i >= values.length || !can) {
                break;
            }
        }
        if(can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
