import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int [] count = new int[4];
        while (true) {
            String input = reader.readLine();
            if (input == null) {
                break;
            }
            String[] temp = input.split(",");
            if (temp[1].equals("A")) {
                count[0]++;
            }else if (temp[1].equals("B")) {
                count[1]++;
            }else if (temp[1].equals("AB")) {
                count[2]++;
            }else if (temp[1].equals("O")) {
                count[3]++;
            }
        }
        for (int i : count) {
            System.out.println(i);
        }
    }
}