import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int i;
        ArrayList<String> out = new ArrayList<>();
        String beforeString = "Hoshino";
        String afterString = "Hoshina";
        int numDataRaws;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try { // read num of dataRaws
            line = input.readLine();
        } catch (IOException e1) {
            System.out.println("IOException in first raw");
        }
        numDataRaws = Integer.parseInt(line);

        try {
            for (i = 0; i < numDataRaws; i++) {
                line = input.readLine();
                out.add(line.replace(beforeString, afterString));
            }
        } catch (NumberFormatException e) {
            System.out.println(line + " include not int");
        } catch (IOException e) {
            System.out.println("IOException in raws after first");
        }

        for (String raw : out) {
            System.out.println(raw);
        }
    }

}
