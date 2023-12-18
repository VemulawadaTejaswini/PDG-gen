
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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int count = 0;
        long total = 0;

        while ((line = br.readLine()) != null) {
            if (index == 0) {
                index = Integer.parseInt(line);
            } else {
                int[] array = new int[index];
                java.util.StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    array[count] = Integer.parseInt(st.nextToken());
                    total += array[count];
                    count++;
                }
                for (int i = 0; i < (index - 1); i++) { //昇順
                    for (int j = (index - 1); j > i; j--) {
                        if (array[j - 1] > array[j]) {
                            int tmp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = tmp;
                        }
                    }
                }

                System.out.println(array[0] + " " + array[index - 1] + " " + total);

                if (index == count) {
                    break;
                }
            }

        }

    }
}

