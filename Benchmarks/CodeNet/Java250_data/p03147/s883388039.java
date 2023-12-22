import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        int h[] = getInput();
        int cnt = 0;
        while (true) {
            int idx = 0;
            while (idx < h.length && h[idx] == 0) idx++;
            if (idx == h.length) {
                break;
            }
            while (idx < h.length && h[idx] > 0) {
                h[idx]--;
                idx++;
            }
            cnt++;
        }
        System.out.println(cnt);
        return;
    }

    private static int[] getInput()
    {
        int[] ret = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            ret = new int[n];
            String hString[] = br.readLine().split("\\s");
            for (int i = 0; i < n; i++) {
                ret[i] = Integer.parseInt(hString[i]);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return ret;
    }

}
