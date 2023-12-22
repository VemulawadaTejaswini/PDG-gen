import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 1; ; i++) {
                String line = reader.readLine();
                int n = Integer.parseInt(line);
                if (n == 0) {
                    break;
                } else {
                    System.out.println("Case " + i + ": " + n);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("??°????????¢????????£????????????????????????");
        }
    }
}