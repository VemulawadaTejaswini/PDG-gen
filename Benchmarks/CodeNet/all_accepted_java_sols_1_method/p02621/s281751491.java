import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long n = Integer.parseInt(buffer.readLine());
        long sum = n + n*n + n*n*n;
        sb.append(sum);
        System.out.println(sb);
    }
}
