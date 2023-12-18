
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author k16069kk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int index = 0;
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            if (index == 0) {
                index = Integer.parseInt(line);
            } else {
                int[] array = new int[index];
                java.util.StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    array[count] = Integer.parseInt(st.nextToken());
                    count++;
                }
                for (int i = (count - 1); i >= 0; i--) {
                    System.out.print(array[i]);
                    if (i != 0) {
                        System.out.print(" ");
                    }
                }

                break;

            }

        }
    }

}

