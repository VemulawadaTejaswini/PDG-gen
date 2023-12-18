import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static long larger = (long)1e18;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(reader.readLine());
        String[] lo = reader.readLine().split(" ");
        long res = 1;
        boolean waslarger = false;
        for (int i = 0; i <N ; i++) {
            res=res*(Long.parseLong(lo[i]));
            if(res > larger) {
                waslarger = true;
            }
        }
        if(waslarger && res!=0)System.out.println(-1);
        else System.out.println(res);

    }
}
