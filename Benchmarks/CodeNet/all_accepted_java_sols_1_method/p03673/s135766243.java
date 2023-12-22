import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
               
        String lineN = br.readLine();
        String lineA = br.readLine();

        int N = Integer.parseInt(lineN);
        String[] strA = lineA.split(" ", 0);
        List<Integer> A = new ArrayList<>();
        for (String str : strA) {
            A.add(Integer.parseInt(str));
        }

        int center = A.size() / 2;
        int[] out = new int[A.size()];
        int j = 1;

        if (N % 2 == 0) {
            for (int i = 0; i < center; i++) {
                out[i + center] = A.get(j - 1);
                out[i + center - j] = A.get(j);
                j += 2;
            }
        } else {
            out[center] = A.get(0);
            for (int i = 0; i < center; i++) {
                out[center + (i + 1)] = A.get(j);
                out[center - (i + 1)] = A.get(j + 1);
                j += 2;
            }
        }

        int len = out.length;
        for (int i = 0; i < len; i++) {
            System.out.print(out[i]);
            if (i != len - 1) {
                System.out.print(" ");
            }
        }
    }
}