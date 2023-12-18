import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author baito
 */
public class Main {
    static StringBuilder sb = new StringBuilder();
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ContestScanner sc = new ContestScanner();
        int n = sc.nextInt();
        char[] c;
        boolean[] dic = new boolean[244140625];
        for (int i = 0; i < n; i++) {

            c = sc.readLine().toCharArray();
            {
                if (c[0] == 'i') {
                    dic[hash(Arrays.copyOfRange(c, 7, c.length))] = true;
                } else {
                    if(dic[hash(Arrays.copyOfRange(c, 5, c.length))]==true)
                        sb.append("yes\n");
                    else
                        sb.append("no\n");
                }
            }
        }
        System.out.print(sb);
    }

    public static int hash(char[] c) {
        int p;
        int hash = 0;
        for (int i = 0; i < c.length; i++) {
            switch (c[i]) {
                case 'A':
                    p = 1;
                    break;
                case 'C':
                    p = 2;
                    break;
                case 'G':
                    p = 3;
                    break;
                default:
                    p = 4;
                    break;
            }
            hash = hash * 5 + p;

        }
        return hash;
    }

}

//????????????????????????
class ContestScanner {

    private final BufferedReader reader;
    private String[] line;
    private int idx;

    public ContestScanner() throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public ContestScanner(String filename) throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
    }
    //???????????? 

    public String readLine() throws Exception {
        return reader.readLine();
    }

    public String nextToken() throws IOException {
        if (line == null || line.length <= idx) {
            line = reader.readLine().trim().split(" ");
            idx = 0;
        }
        return line[idx++];
    }

    public long nextLong() throws IOException, NumberFormatException {
        return Long.parseLong(nextToken());
    }

    public int nextInt() throws NumberFormatException, IOException {
        return (int) nextLong();
    }

    public double nextDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(nextToken());
    }
}