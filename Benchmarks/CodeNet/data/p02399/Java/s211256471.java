import java.io.*;

class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] line = reader.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);

            int d = a / b;
            int r = a % b;
            double f = (double) a / b;

            System.out.printf("%d %d %f", d, r, f);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}