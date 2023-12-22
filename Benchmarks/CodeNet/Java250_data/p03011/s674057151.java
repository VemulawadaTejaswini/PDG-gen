import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] times = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(times);
        System.out.println(times[0] + times[1]);
    }
}