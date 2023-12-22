import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] train = new int[2];
        int[] bus = new int[2];
        train[0] = sc.nextInt();
        train[1] = sc.nextInt();
        bus[0] = sc.nextInt();
        bus[1] = sc.nextInt();
        Arrays.sort(train);
        Arrays.sort(bus);
        System.out.println(train[0] + bus[0]);
    }
}