import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final String CUP_A = "A";

    private static final String CUP_B = "B";

    private static final String CUP_C = "C";

    private static final String SPLIT_COMMA = ",";

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        Map<String, Object> cup = new HashMap<String, Object>();
        cup.put(CUP_A, new Object());
        cup.put(CUP_B, null);
        cup.put(CUP_C, null);

        try {
            while ((input = in.readLine()) != null) {

                String[] change = input.split(SPLIT_COMMA);

                Object tmp = cup.get(change[0]);
                cup.put(change[0], cup.get(change[1]));
                cup.put(change[1], tmp);
            }

            for (Map.Entry<String, Object> entry : cup.entrySet()) {
                if(entry.getValue() != null) {
                    System.out.println(entry.getKey());
                    break;
                }
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