import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        Integer[] org = new Integer[N];
        Arrays.fill(org, 0);
        for (int i = 1; i < N; i++) {
            org[input.nextInt()-1]++;
        }
        for (int num : org) {
            System.out.println(num);
        }
    }
}
