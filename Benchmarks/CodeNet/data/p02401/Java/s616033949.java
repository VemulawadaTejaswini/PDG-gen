import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        int num = 0;
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<String> st = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] line = br.readLine().split(" ");
            if ("?".equals(line[1])) {
                break;
            }
            x.add(Integer.parseInt(line[0]));
            st.add(line[1]);
            y.add(Integer.parseInt(line[2]));

        }

        for (int i = 0; i < x.size(); i++) {
            if ("+".equals(st.get(i))) {
                System.out.println(x.get(i) + y.get(i));
            }

            if ("-".equals(st.get(i))) {
                System.out.println(x.get(i) - y.get(i));
            }

            if ("*".equals(st.get(i))) {
                System.out.println(x.get(i) * y.get(i));
            }

            if ("/".equals(st.get(i))) {
                System.out.println(x.get(i) / y.get(i));
            }
        }

    }

}