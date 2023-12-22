import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");

        String A = values[0];
        String B = values[1];
        line = scanner.nextLine();
        values = line.split(" ");
        int AC = Integer.parseInt(values[0]);
        int BC = Integer.parseInt(values[1]);
        line = scanner.nextLine();
        values = line.split(" ");
        String sute = values[0];
        if (A.equals(sute)) {
            System.out.println((AC - 1) + " " + BC);
        } else if (B.equals(sute))  {
            System.out.println(AC + " " + (BC - 1));
        } else {
            System.out.println(AC + " " + BC);
        }
     }
}