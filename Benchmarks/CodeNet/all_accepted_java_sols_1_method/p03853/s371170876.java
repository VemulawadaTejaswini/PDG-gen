import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int h = Integer.parseInt(str[0]);

        for(int i=0; i<h; i++){
            String in = br.readLine();
            System.out.println(in);
            System.out.println(in);
        }
    }
}
