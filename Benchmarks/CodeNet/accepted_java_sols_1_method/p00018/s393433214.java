import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        List<Integer> num = new ArrayList<Integer>();
        while ((line = in.readLine()) != null) {
            String[] strs = line.split("\\s+");
            for (int i = 0; i < 5; i++) {
                num.add(Integer.parseInt(strs[i]));
            }
            Collections.sort(num, Collections.reverseOrder());
            for (int i = 0; i < 4; i++) {
                System.out.print(num.get(i) + " ");
            }
            System.out.println(num.get(4));
        }
    }
}

