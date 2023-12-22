import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String inputData = scan.nextLine();
            while (inputData != null && !"".equals(inputData)) {
                String[] inputDataSP = inputData.split(" ");
                long a = Long.parseLong(inputDataSP[0]);
                long b = Long.parseLong(inputDataSP[1]);
                long gcd = gcd(a, b);
                long lcm = (a * b) / gcd;
                System.out.println(gcd + " " + lcm);
                inputData = scan.nextLine();
            }
            scan.close();
        } catch (Exception e) {
            System.exit(0);
        }
    }

    private static long gcd(long a, long b) {
        if (a < b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        long mod = -1;
        while ((mod = a % b) != 0) {
            a = b;
            b = mod;
        }
        return b;
    }
}