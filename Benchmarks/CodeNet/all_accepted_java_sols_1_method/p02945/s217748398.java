import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int[] r = new int[3];
        r[0] = a + b;
        r[1] = a - b;
        r[2] = a * b;
        int max = r[0];

        for (int i = 1; i < 3; i++) {
            max = Math.max(max, r[i]);
        }

        System.out.println(max);

    }
}