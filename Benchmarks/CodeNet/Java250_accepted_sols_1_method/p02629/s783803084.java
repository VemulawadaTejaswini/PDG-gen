import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long n = Long.parseLong(buffer.readLine());
        String name = "";
        while (n != 0)
        {
            n--;
            name += (char)('a'+ (n%26));
            n /= 26;
        }
        sb.append(name);
        sb = sb.reverse();
        sb.append("\n");
        System.out.println(sb);
    }
}
