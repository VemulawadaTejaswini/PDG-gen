import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int W = Integer.parseInt(arr[0]);
        int H = Integer.parseInt(arr[1]);
        String[] arr2 = br.readLine().split(" ");
        int w = Integer.parseInt(arr2[0]);
        int h = Integer.parseInt(arr2[1]);
        out.println((H - h) * ( W - w));
        out.close();
    }
}
