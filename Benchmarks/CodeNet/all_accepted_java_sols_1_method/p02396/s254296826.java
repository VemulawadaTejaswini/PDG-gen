import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{ 
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int i = 0, x;
            while (0 != (x = Integer.parseInt(br.readLine()))) {
                System.out.printf("Case %d: %d%n", ++i, x);
            }
        }
    }
}

