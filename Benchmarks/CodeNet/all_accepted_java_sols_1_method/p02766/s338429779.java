import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        long a = Long.parseLong(values[0]);
        int b = Integer.parseInt(values[1]);
        String c = Long.toString(a,b);
        System.out.println(c.length());
    }
}