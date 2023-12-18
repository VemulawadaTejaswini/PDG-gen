
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();

        int dist = X;
        
        int count = 1;
        while(dist != 0) {
            dist = (dist + X) % 360;
            count++;
        }

        System.out.println(count);
    }
}
