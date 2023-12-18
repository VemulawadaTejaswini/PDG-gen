import java.io.*;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {

            String line;
            int i = 1;

            while ((Integer.parseInt(line = reader.readLine())) != 0) {

                System.out.println("case " + i + ": " + line);
                i++;

            }

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

}