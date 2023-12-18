import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        while(true) {
            int i = 1;
            x = Integer.parseInt(br.readLine());
            if(x == 0)
                break;
            System.out.println("Case " + i + ": " + x);
            i++;
        }
    }
}