import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxLeft = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (heights[i] >= maxLeft) {
                count++;
                maxLeft = heights[i];
            }
        }

        System.out.println(count);
    }
}
