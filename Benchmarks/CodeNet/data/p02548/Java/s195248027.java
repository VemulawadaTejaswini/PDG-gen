import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        long cnt = 0;
        for (int fact = 1; fact <= n ; fact++) {
            cnt+=n/fact;
            if (n%fact == 0)
                cnt--;
        }
        System.out.println(cnt);
    }
}
