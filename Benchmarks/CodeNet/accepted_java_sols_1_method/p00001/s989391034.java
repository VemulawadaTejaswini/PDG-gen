import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mtHeight = new int[10];
        
        for (int i = 0; i < 10; i++) {
            mtHeight[i] = scanner.nextInt();
        }
        Arrays.sort(mtHeight);

        for (int i = mtHeight.length-1; i >= 7; i--) {
            System.out.println(mtHeight[i]);
        }
    }
}