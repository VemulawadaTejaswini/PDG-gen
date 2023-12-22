import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String[] input = reader.readLine().split(" ");

        char[] a = input[0].toCharArray();
        char[] b = input[1].toCharArray();
        char[] c = input[2].toCharArray();

        if (a[a.length-1] != b[0] || b[b.length-1] != c[0]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

//        PrintWriter writer = new PrintWriter(System.out);
//
//        writer.close();


    }
}
