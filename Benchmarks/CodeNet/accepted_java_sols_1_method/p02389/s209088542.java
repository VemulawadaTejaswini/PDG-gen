import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by S64 on 15/07/26.
 */
class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int arg1 = Integer.parseInt(inputs[0]);
        int arg2 = Integer.parseInt(inputs[1]);
        int rectangle, length;
        {
            rectangle = arg1 * arg2;
            length = (arg1 + arg2) * 2;
        }
        {
            System.out.println( String.format("%d %d", rectangle, length) );
        }
    }

}