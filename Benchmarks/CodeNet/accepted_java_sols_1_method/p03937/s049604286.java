import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> input = new ArrayList<String>();
        while (in.hasNextLine()) {
            input.add(in.nextLine());
        }
        in.close();
        int y = Integer.parseInt(input.get(0).split(" ")[0]);
        int x = Integer.parseInt(input.get(0).split(" ")[1]);
        int count = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (input.get(i + 1).charAt(j) == '#') {
                    count++;
                }
            }
        }
        String str = y + x - 1 == count ? "Possible" : "Impossible";
        System.out.println(str);
    }
}