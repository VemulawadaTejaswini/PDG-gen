import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

            int n = Integer.parseInt(in.readLine());

            if (n == 52) {
                System.exit(0);
            }

            Set<Integer> s = new HashSet<>();
            Set<Integer> h = new HashSet<>();
            Set<Integer> c = new HashSet<>();
            Set<Integer> d = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String[] arr = in.readLine().split(" ");
                String type = arr[0];
                int num = Integer.parseInt(arr[1]);
                switch (type) {
                    case "S":
                        s.add(num);
                        break;
                    case "H":
                        h.add(num);
                        break;
                    case "C":
                        c.add(num);
                        break;
                    default:
                        d.add(num);
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 13; i++) {
                int num = i + 1;
                if (!s.contains(num)) {
                    sb.append("S ").append(num).append("\n");
                }
            }
            for (int i = 0; i < 13; i++) {
                int num = i + 1;
                if (!h.contains(num)) {
                    sb.append("H ").append(num).append("\n");
                }
            }
            for (int i = 0; i < 13; i++) {
                int num = i + 1;
                if (!c.contains(num)) {
                    sb.append("C ").append(num).append("\n");
                }
            }
            for (int i = 0; i < 13; i++) {
                int num = i + 1;
                if (!d.contains(num)) {
                    sb.append("D ").append(num).append("\n");
                }
            }

            System.out.print(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}

