import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] counts = new int[4];
        for(int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            counts[a-1] += 1;
            counts[b-1] += 1;
        }
        Arrays.sort(counts);
        if(counts[0] == 1 && counts[1] == 1 && counts[2] == 2 && counts[3] == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
