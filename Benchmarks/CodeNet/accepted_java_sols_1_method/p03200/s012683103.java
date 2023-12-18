import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] array = br.readLine().split("");
        long bi = 0;
        int bc = 0;
        long s = array.length;
        for (int i = 0; i < s; i++) {
            if (array[i].equals("B")) {
                bi += i;
                bc++;
            } 
        }
        long m = 0;
        for (int i = 0; i < bc; i++) {
            m += s - i - 1;
        }
        out.println(m - bi);
        out.close();
    }
}
