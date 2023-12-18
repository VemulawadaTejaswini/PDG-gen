import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        int j = 0, m;
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] h = new int[200];
        String str1, str2;
        String[] line = new String[10];
        try {
            while ((line[j] = reader.readLine()) != null) {
                if (line[j].equals("-")) {
                    break;
                }
                m = sc.nextInt();
                for (int k = 0; k < m; k++) {
                    h[k] = sc.nextInt();
                }
                for (int i = 0; i < m; i++) {
                    str1 = line[j].substring(0, h[i]);
                    str2 = line[j].substring(h[i], line[j].length());
                    line[j] = str2.concat(str1);
                }
                j++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        for (int n = 0; n < j; n++) {
            System.out.println(line[n]);
        }
        sc.close();
    }
}
