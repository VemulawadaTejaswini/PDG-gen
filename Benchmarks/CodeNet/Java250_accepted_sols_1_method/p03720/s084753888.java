import java.util.Scanner;

/**
 * @author varun on 7/1/2018
 * @project CompetitiveProgramming
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m  = scanner.nextInt();
        int[] cities = new int[n];
        for (int i = 0; i < m; i++) {
            int c1 = scanner.nextInt(), c2 = scanner.nextInt();
            cities[c1-1]++;
            cities[c2-1]++;
        }
        for (int city : cities) System.out.println(city);
    }
}
