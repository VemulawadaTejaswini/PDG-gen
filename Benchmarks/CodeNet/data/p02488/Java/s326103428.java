import java.io.*;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        List<String> array = new ArrayList<String>();
        for (int ii = 0; ; ii++) {
            String line = br.readLine();
            if (ii == 0) {
                continue;
            }
            if (line == null || line.length() == 0) {
                break;
            }
            array.add(line);
        }
        if (array.size() == 0) {
            return;
        }
        Collections.sort(array);
        System.out.println(array.get(0));
    }
}