import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] inputs = reader.readLine().split(" ");
        int num  = Integer.parseInt(inputs[0]+inputs[1]+inputs[2]);
        if(num %4 ==0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}