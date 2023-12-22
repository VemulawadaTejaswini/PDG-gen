
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yoshizaki
 * ABC 132
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int problems = scanner.nextInt();
        int[] difficults = new int[problems];
        for (int i = 0; i < problems; i++) {
            difficults[i] = scanner.nextInt();
        }
        Arrays.sort(difficults);
        int under = difficults[(problems / 2) -1];
        int over = difficults[problems / 2];
        int answer = over -under;
        
        System.out.println(answer);
    }
}
