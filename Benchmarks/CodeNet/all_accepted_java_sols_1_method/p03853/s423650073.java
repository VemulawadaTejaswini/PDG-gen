
import java.io.*;
import java.util.*;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        String a[] = br.readLine().split(" ");
        int row = Integer.parseInt(a[0]);
        int col = Integer.parseInt(a[1]);
        String s, str = "";
        for (int i = 0; i < row; i++) {
            s = br.readLine();
            str += s + "\n" + s + "\n";
        }
        System.out.println(str);
        bw.flush();
    }
}
