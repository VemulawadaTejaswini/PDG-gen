import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();

            double x1 = Double.parseDouble(input.split(" ")[0]);
            double y1 = Double.parseDouble(input.split(" ")[1]);
            double x2 = Double.parseDouble(input.split(" ")[2]);
            double y2 = Double.parseDouble(input.split(" ")[3]);
            double x3 = Double.parseDouble(input.split(" ")[4]);
            double y3 = Double.parseDouble(input.split(" ")[5]);
            double x4 = Double.parseDouble(input.split(" ")[6]);
            double y4 = Double.parseDouble(input.split(" ")[7]);

            double d = (x2 - x1) * (y4 - y3) - (y2- y1) * (x4 - x3);

            System.out.println((d == 0.0)? "YES" : "NO");
        }
    }
}