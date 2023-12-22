import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        int a = 0;

        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());

        String[] line = br.readLine().split(" ");
        for (int i = 0; i < a; i++) {
            list.add(Integer.parseInt(line[i]));
        }

        Collections.reverse(list);

        for (int x = 0; x < a; x++) {
            if (x == a - 1) {
                System.out.println(list.get(x));
            } else {
                System.out.printf("%d ", list.get(x));
            }
        }

    }

}