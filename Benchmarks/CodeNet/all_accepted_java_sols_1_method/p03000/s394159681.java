import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] params = line1.split(" ");
        int N = Integer.parseInt(params[0]);
        int X = Integer.parseInt(params[1]);
        int sum = 0;
        int count = 1;
        String[] L = br.readLine().split(" ");
        for(String l : L) {
            sum += Integer.parseInt(l);
            count = sum <= X ? ++count : count;
        }
        System.out.println(count);
    }
}
