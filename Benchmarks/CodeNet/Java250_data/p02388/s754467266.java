import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = 
                    new BufferedReader( new InputStreamReader(System.in));
            String seedStr = stdReader.readLine();

            Integer seed = Integer.valueOf(seedStr);
            Integer cubicSeed = seed * seed * seed; 
            System.out.println(cubicSeed);
            System.exit(0);

        } catch (Exception e) {
            System.exit(-1);
        }
    }
}