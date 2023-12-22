import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        int yen = b * 10;
        while (yen < (b+1) * 10 && (int)(yen * 0.08) != a)
            yen++;
        System.out.println(yen < (b+1)*10 ? yen : -1);
    }
}