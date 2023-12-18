import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            String[] num = line.split(" ", -1);
            int a = Integer.parseInt(num[0]);
            int b = Integer.parseInt(num[1]);
            int c = Integer.parseInt(num[2]);
            if (a <= b && b <= c && a <= c) {
                int x = a;
                int y = b;
                int z = c;
                System.out.println(x + " " + y + " "  + z);
            } else if (a <= b && b >= c && a <= c) {
                int x = a;
                int y = c;
                int z = b;
                System.out.println(x + " " + y + " "  + z);
            } else if (a >= b && b <= c && a <= c) {
                int x = b;
                int y = a;
                int z = c;
                System.out.println(x + " " + y + " "  + z);
            } else if (a <= b & b >= c && a >= c) {
                int x = c;
                int y = a;
                int z = b;
                System.out.println(x + " " + y + " "  + z);
            } else if (a >= b && b <= c && a >= c) {
                int x = b;
                int y = c;
                int z = a;
                System.out.println(x + " " + y + " "  + z);
            } else if (a >= b && b >= c && a >= c) {
                int x = c;
                int y = b;
                int z = a;
                System.out.println(x + " " + y + " "  + z);
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
    }
}