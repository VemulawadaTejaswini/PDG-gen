import java.io.*;

class main {
    public static void main(String[] a) {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        try {
            String line = reader.readLine();
            int x = Integer.parseInt(line);

            int answer = x * x * x;

            System.out.println(answer);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}