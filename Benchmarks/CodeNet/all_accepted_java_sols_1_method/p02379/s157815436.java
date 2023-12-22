import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        double[] n = new double[4];
        for (int i = 0; i < 4; i++) {
            n[i] = Double.parseDouble(strs[i]);
        }
        System.out.println(Math.sqrt(Math.pow(n[0] - n[2], 2) + Math.pow(n[1] - n[3], 2)));
    }
}