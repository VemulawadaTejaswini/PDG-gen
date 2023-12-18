import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] params = scanner.nextLine().split(" ");
        scanner.close();

        int k = Integer.parseInt(params[0]);
        int x = Integer.parseInt(params[1]);

        int min = x - k + 1;
        int max = x + k - 1;

        ArrayList<String> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (i >= -1000000 && i <= 1000000) {
                list.add(String.valueOf(i));
            }
        }
        
        System.out.println(String.join(" ", list.toArray(new String[list.size()])));
    }
}