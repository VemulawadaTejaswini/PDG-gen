import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMon = scanner.nextInt();
        int special = scanner.nextInt();
        int[] hps = new int[numMon];
        for(int i = 0; i < numMon; i++) {
            hps[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(hps);
        int removeNum = Math.min(special, numMon);
        long remainSum = 0;
        for(int i = 0; i < numMon-removeNum; i++) {
            remainSum += hps[i];
        }

        System.out.println(remainSum);
    }
}
