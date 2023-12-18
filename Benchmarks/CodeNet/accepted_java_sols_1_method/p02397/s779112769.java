import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        ArrayList<Integer> x_list = new ArrayList<>();
        ArrayList<Integer> y_list = new ArrayList<>();

        int x;
        int y;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            String[] line = br.readLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            if (x == 0 && y == 0) {
                break;
            }

            x_list.add(x);
            y_list.add(y);

        } while (x != 0 || y != 0);

        for (int i = 0; i < x_list.size(); i++) {
            if (x_list.get(i) > y_list.get(i)) {
                System.out.println(y_list.get(i) + " " + x_list.get(i));
            } else {
                System.out.println(x_list.get(i) + " " + y_list.get(i));
            }
        }

    }

}