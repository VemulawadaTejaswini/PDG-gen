import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String REGIX_COMMA = ",";

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int wide = 0;
        int num = 0;

        try {
            wide = Integer.valueOf(in.readLine());
            num = Integer.valueOf(in.readLine());

            int[] lot = new int[wide];

            for (int i = 0; i < lot.length; i++) {
                lot[i] = i + 1;
            }

            for (int j = 0; j < num; j++) {

                String[] changePosition = in.readLine().split(REGIX_COMMA);
                int left = Integer.valueOf(changePosition[0]) - 1;
                int right = Integer.valueOf(changePosition[1]) - 1;

                int temp = lot[left];
                lot[left] = lot[right];
                lot[right] = temp;
            }

            for (int answer : lot) {
                System.out.println(answer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}