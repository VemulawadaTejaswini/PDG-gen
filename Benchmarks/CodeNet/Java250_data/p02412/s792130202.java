
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String[] columns;
        int a1 = 0;
        int a2 = 0;
        int res = 0;

        while (true) {
            String line = reader.readLine();
            columns = line.split(" ");
            a1 = Integer.parseInt(columns[0]);
            a2 = Integer.parseInt(columns[1]);
            if (a1 == 0 && a2 == 0) {
                break;
            }

            res = pattern(a1, a2);
            builder.append(res)
                   .append("\n");
        }
        System.out.print(builder);
    }

    public static int pattern(int a1, int a2) {
        int list = 0;
        for (int x = 1; x <= a1; x++) {
            for (int y = x + 1; y <= a1 ; y++) {
                for (int z = y + 1; z <= a1; z++) {
                    if (x + y + z == a2) {
                        list += 1;
                    }
                }
            }
        }
        return list;
    }
}