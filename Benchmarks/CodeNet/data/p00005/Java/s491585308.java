import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String inputData = scan.nextLine();
            if ("".equals(inputData)) {
                scan.close();
                break;
            }
            String[] inputDataSP = inputData.split(" ");
            long a = Integer.parseInt(inputDataSP[0]);
            long b = Integer.parseInt(inputDataSP[1]);
            long gcd = gcd(a, b);
            long lcm = (a * b) / gcd;
            System.out.println(gcd + " " + lcm);
        }
    }

    private static long gcd(long a, long b) {
        a = (a < b) ? b : a;
        b = (a < b) ? a : b;
        long mod = -1;
        while ((mod = a % b) != 0) {
            a = b;
            b = mod;
        }
        return b;
    }
}